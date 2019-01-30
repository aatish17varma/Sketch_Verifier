#Run program : python3 converter.py [first-program] [second-program]
#Requirements:
#  a) function declarations must have the beginning paranthesis on the same line as the name of the function,
#  b) functions have same number and type of innput parameters, 
#  c) only comparing two functions

import sys
all_holes = {}
inputs = []
new_function_headers = []
f = open("./verifier.sk", "w");
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
                f.write(newFunctionLine + "\n") 
            elif "assert" not in line: #assert statements should not be printed, print rest of function
                f.write(line + "\n")
            


f.write("harness void main(")
for key in all_holes:
    f.write(key + ",")
for i in inputs:
    f.write(i)
f.write("){" + "\n") 

for key, value in all_holes.items():
    strn = "assume(" + key.split()[1] + "< " +  str(2 ** int(value)) + ")" + "\n";
    f.write(strn)

f.write('\n/*Add transformation statement*/\n')

strn = "assert(" + new_function_headers[0][new_function_headers[0].index(" ") : ] +  "==" + new_function_headers[1][new_function_headers[1].index(" ") : ] +  ");"
f.write(strn + "\n")

f.write("}")