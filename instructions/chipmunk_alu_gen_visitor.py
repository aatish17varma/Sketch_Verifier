from instructionParser import instructionParser
from instructionVisitor import instructionVisitor
class ChipmunkAluGenVisitor(instructionVisitor):
  def __init__(self, instruction_file):
    self.instruction_file = instruction_file
    self.mux3Count = 0
    self.mux2Count = 0
    self.relopCount = 0
    self.optCount = 0
    self.helperFunctionStrings = "\n\n\n"


  def visitInstruction(self, ctx):
    print("int atom(")
    self.visit(ctx.getChild(0))
    self.visit(ctx.getChild(1))
    print(") {")
    self.visit(ctx.getChild(2))
    print("\n}")


  def visitState_var(self, ctx):
    print(ctx.getText(), end = '')



  def visitState_vars(self, ctx):
    print("ref int ", end = '')
    self.visit(ctx.getChild(0))
    print(',')
    print("ref int ", end = '')
    self.visit(ctx.getChild(1))



  def visitMux2(self, ctx):
    print("Mux2_" + str(self.mux2Count) + "(", end='')
    self.visit(ctx.getChild(2))
    print(",")
    self.visit(ctx.getChild(4))
    print(")")
    self.generate2Mux()
    self.mux2Count += 1



  def visitMux3(self, ctx):
    print("Mux3_" + str(self.mux3Count) + "(", end='')
    self.visit(ctx.getChild(2))
    print(",", end='')
    self.visit(ctx.getChild(4))
    print(",", end='')
    self.visit(ctx.getChild(6))    
    print(")", end='')
    self.generate3Mux()
    self.mux3Count += 1


  def visitOpt(self, ctx):
    print("Opt_" + str(self.optCount) + "(", end='')
    self.visitChildren(ctx)
    print(")", end='')
    self.generateOpt()
    self.optCount += 1
   


  def visitRelOp(self, ctx):
    print("rel_op_" + str(self.relopCount) + "(", end='')
    self.visit(ctx.getChild(2))
    print(",", end='')
    self.visit(ctx.getChild(4))
    print(")", end='')
    self.generateRelOp()
    self.relopCount += 1


  def visitConstant(self, ctx):
    print(ctx.getText(), end='')


  def visitPacketField(self, ctx):
    print(ctx.getText(), end='')
    self.visitChildren(ctx)
  

  def visitGuarded_update(self, ctx):
    print("if(", end='')
    self.visit(ctx.getChild(0))
    print(")")
    print("{")
    self.visit(ctx.getChild(2))
    print("\n}")

  def visitExprWithOp(self, ctx):
    self.visit(ctx.getChild(0))
    print(ctx.getChild(1).getText(), end='')
    self.visit(ctx.getChild(2))


  def generate2Mux(self):
    self.helperFunctionStrings += """int Mux2_""" + str(self.mux2Count) +  """(int op1, int op2) {
    int choice = ??(1);
    if (choice == 0) return op1;
    else if (choice == 1) return op2;
    } \n\n"""

  def generate3Mux(self):
    self.helperFunctionStrings += """int Mux3_""" + str(self.mux3Count) + """(int op1, int op2, int op3) {
    int choice = ??(2);
    if (choice == 0) return op1;
    else if (choice == 1) return op2;
    else if (choice == 2) return op3;
    else assert(false);
    } \n\n"""

  def generateRelOp(self):
    self.helperFunctionStrings += """bit rel_op_""" + str(self.relopCount) + """(int operand1, int operand2) {
    int opcode = ??(2);
    if (opcode == 0) {
      return operand1 != operand2;
    } else if (opcode == 1) {
      return operand1 < operand2;
    } else if (opcode == 2) {
      return operand1 > operand2;
    } else {
      assert(opcode == 3);
      return operand1 == operand2;
    }
    } \n\n"""
  

  def generateOpt(self):
    self.helperFunctionStrings += """generator int Opt_""" + str(self.optCount) + """(int op1) {
    bit enable = ??(1);
    if (! enable) return 0;
    return op1;
    } \n\n"""
