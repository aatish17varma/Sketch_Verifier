# Generated from instruction.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .instructionParser import instructionParser
else:
    from instructionParser import instructionParser

# This class defines a complete generic visitor for a parse tree produced by instructionParser.

class instructionVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by instructionParser#state_var.
    def visitState_var(self, ctx:instructionParser.State_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#packet_field.
    def visitPacket_field(self, ctx:instructionParser.Packet_fieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#state_var_with_comma.
    def visitState_var_with_comma(self, ctx:instructionParser.State_var_with_commaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#state_vars.
    def visitState_vars(self, ctx:instructionParser.State_varsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#packet_field_with_comma.
    def visitPacket_field_with_comma(self, ctx:instructionParser.Packet_field_with_commaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#packet_fields.
    def visitPacket_fields(self, ctx:instructionParser.Packet_fieldsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#guarded_update_with_comma.
    def visitGuarded_update_with_comma(self, ctx:instructionParser.Guarded_update_with_commaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#guarded_updates.
    def visitGuarded_updates(self, ctx:instructionParser.Guarded_updatesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#guarded_update.
    def visitGuarded_update(self, ctx:instructionParser.Guarded_updateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#RelOp.
    def visitRelOp(self, ctx:instructionParser.RelOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#True.
    def visitTrue(self, ctx:instructionParser.TrueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#update.
    def visitUpdate(self, ctx:instructionParser.UpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#PacketField.
    def visitPacketField(self, ctx:instructionParser.PacketFieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#ExprWithOp.
    def visitExprWithOp(self, ctx:instructionParser.ExprWithOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#Opt.
    def visitOpt(self, ctx:instructionParser.OptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#Mux2.
    def visitMux2(self, ctx:instructionParser.Mux2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#Constant.
    def visitConstant(self, ctx:instructionParser.ConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#Mux3.
    def visitMux3(self, ctx:instructionParser.Mux3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#StateVar.
    def visitStateVar(self, ctx:instructionParser.StateVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#ExprWithParen.
    def visitExprWithParen(self, ctx:instructionParser.ExprWithParenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by instructionParser#instruction.
    def visitInstruction(self, ctx:instructionParser.InstructionContext):
        return self.visitChildren(ctx)



del instructionParser