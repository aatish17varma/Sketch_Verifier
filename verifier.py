import sys
#Run program : python3 verifier.py [first-program] [second-program]
#Requirements a) function declarations must have the beginning paranthesis on the same line as the name of the function, b) functions have same number and type of innput parameters, c) only comparing two functions
all_holes = {}
inputs = []
new_function_headers = []
for i in range(1, len(sys.argv)):
    types = ["bit", "int", "char", "double", "float"]
    function_holes = {} #hole_name : bit amount 
    file = open(sys.argv[i], "r")
    if file.mode == "r":
        contents = file.read()
        for line in contents.splitlines():
            if "= ??" in line: #lines with a hole 
                function_holes[line[0:line.index("= ??")].strip()] = line[line.index("(") + 1 : line.index(")")]
                all_holes[line[0:line.index("= ??")].strip()] = line[line.index("(") + 1 : line.index(")")]
            elif any(x in line for x in types) and "{" in line and "(" in line and ")" in line and "{": #definition of a function declaration
                
                if(line[line.index("(") + 1: line.index(")")] not in inputs): #find input variables
                    inputs.append(line[line.index("(") + 1: line.index(")")])
                
                newFunctionLine = line[:line.index("(") + 1] #e.g. |int a|{}
                
                for key, value in function_holes.items():
                    newFunctionLine += (key + ", ")  #make holes input variables 
                newFunctionLine += line[line.index("(") + 1:line.index(")")] + "){" #close function parameter parenthesis and add bracket
                new_function_headers.append(newFunctionLine[:len(newFunctionLine) - 1])
                print(newFunctionLine) 
            elif "assert" not in line: #print rest of function
                print(line)
            


print("harness void main(")
for key in all_holes:
    print(key)
for i in inputs:
    print(i)
print("){") 

for key, value in all_holes.items():
    print("assume(",key.split()[1],"< ", 2 ** int(value),")")

print('\n/*Add transformation statement*/')

print("assert(", new_function_headers[0][new_function_headers[0].index(" ") : ], "==", new_function_headers[1][new_function_headers[1].index(" ") : ], ");");

print("}")