# Generated from instruction.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .instructionParser import instructionParser
else:
    from instructionParser import instructionParser

# This class defines a complete listener for a parse tree produced by instructionParser.
class instructionListener(ParseTreeListener):

    # Enter a parse tree produced by instructionParser#state_var.
    def enterState_var(self, ctx:instructionParser.State_varContext):
        pass

    # Exit a parse tree produced by instructionParser#state_var.
    def exitState_var(self, ctx:instructionParser.State_varContext):
        pass


    # Enter a parse tree produced by instructionParser#packet_field.
    def enterPacket_field(self, ctx:instructionParser.Packet_fieldContext):
        pass

    # Exit a parse tree produced by instructionParser#packet_field.
    def exitPacket_field(self, ctx:instructionParser.Packet_fieldContext):
        pass


    # Enter a parse tree produced by instructionParser#state_var_with_comma.
    def enterState_var_with_comma(self, ctx:instructionParser.State_var_with_commaContext):
        pass

    # Exit a parse tree produced by instructionParser#state_var_with_comma.
    def exitState_var_with_comma(self, ctx:instructionParser.State_var_with_commaContext):
        pass


    # Enter a parse tree produced by instructionParser#state_vars.
    def enterState_vars(self, ctx:instructionParser.State_varsContext):
        pass

    # Exit a parse tree produced by instructionParser#state_vars.
    def exitState_vars(self, ctx:instructionParser.State_varsContext):
        pass


    # Enter a parse tree produced by instructionParser#packet_field_with_comma.
    def enterPacket_field_with_comma(self, ctx:instructionParser.Packet_field_with_commaContext):
        pass

    # Exit a parse tree produced by instructionParser#packet_field_with_comma.
    def exitPacket_field_with_comma(self, ctx:instructionParser.Packet_field_with_commaContext):
        pass


    # Enter a parse tree produced by instructionParser#packet_fields.
    def enterPacket_fields(self, ctx:instructionParser.Packet_fieldsContext):
        pass

    # Exit a parse tree produced by instructionParser#packet_fields.
    def exitPacket_fields(self, ctx:instructionParser.Packet_fieldsContext):
        pass


    # Enter a parse tree produced by instructionParser#guarded_update_with_comma.
    def enterGuarded_update_with_comma(self, ctx:instructionParser.Guarded_update_with_commaContext):
        pass

    # Exit a parse tree produced by instructionParser#guarded_update_with_comma.
    def exitGuarded_update_with_comma(self, ctx:instructionParser.Guarded_update_with_commaContext):
        pass


    # Enter a parse tree produced by instructionParser#guarded_updates.
    def enterGuarded_updates(self, ctx:instructionParser.Guarded_updatesContext):
        pass

    # Exit a parse tree produced by instructionParser#guarded_updates.
    def exitGuarded_updates(self, ctx:instructionParser.Guarded_updatesContext):
        pass


    # Enter a parse tree produced by instructionParser#guarded_update.
    def enterGuarded_update(self, ctx:instructionParser.Guarded_updateContext):
        pass

    # Exit a parse tree produced by instructionParser#guarded_update.
    def exitGuarded_update(self, ctx:instructionParser.Guarded_updateContext):
        pass


    # Enter a parse tree produced by instructionParser#RelOp.
    def enterRelOp(self, ctx:instructionParser.RelOpContext):
        pass

    # Exit a parse tree produced by instructionParser#RelOp.
    def exitRelOp(self, ctx:instructionParser.RelOpContext):
        pass


    # Enter a parse tree produced by instructionParser#True.
    def enterTrue(self, ctx:instructionParser.TrueContext):
        pass

    # Exit a parse tree produced by instructionParser#True.
    def exitTrue(self, ctx:instructionParser.TrueContext):
        pass


    # Enter a parse tree produced by instructionParser#update.
    def enterUpdate(self, ctx:instructionParser.UpdateContext):
        pass

    # Exit a parse tree produced by instructionParser#update.
    def exitUpdate(self, ctx:instructionParser.UpdateContext):
        pass


    # Enter a parse tree produced by instructionParser#PacketField.
    def enterPacketField(self, ctx:instructionParser.PacketFieldContext):
        pass

    # Exit a parse tree produced by instructionParser#PacketField.
    def exitPacketField(self, ctx:instructionParser.PacketFieldContext):
        pass


    # Enter a parse tree produced by instructionParser#ExprWithOp.
    def enterExprWithOp(self, ctx:instructionParser.ExprWithOpContext):
        pass

    # Exit a parse tree produced by instructionParser#ExprWithOp.
    def exitExprWithOp(self, ctx:instructionParser.ExprWithOpContext):
        pass


    # Enter a parse tree produced by instructionParser#Opt.
    def enterOpt(self, ctx:instructionParser.OptContext):
        pass

    # Exit a parse tree produced by instructionParser#Opt.
    def exitOpt(self, ctx:instructionParser.OptContext):
        pass


    # Enter a parse tree produced by instructionParser#Mux2.
    def enterMux2(self, ctx:instructionParser.Mux2Context):
        pass

    # Exit a parse tree produced by instructionParser#Mux2.
    def exitMux2(self, ctx:instructionParser.Mux2Context):
        pass


    # Enter a parse tree produced by instructionParser#Constant.
    def enterConstant(self, ctx:instructionParser.ConstantContext):
        pass

    # Exit a parse tree produced by instructionParser#Constant.
    def exitConstant(self, ctx:instructionParser.ConstantContext):
        pass


    # Enter a parse tree produced by instructionParser#Mux3.
    def enterMux3(self, ctx:instructionParser.Mux3Context):
        pass

    # Exit a parse tree produced by instructionParser#Mux3.
    def exitMux3(self, ctx:instructionParser.Mux3Context):
        pass


    # Enter a parse tree produced by instructionParser#StateVar.
    def enterStateVar(self, ctx:instructionParser.StateVarContext):
        pass

    # Exit a parse tree produced by instructionParser#StateVar.
    def exitStateVar(self, ctx:instructionParser.StateVarContext):
        pass


    # Enter a parse tree produced by instructionParser#ExprWithParen.
    def enterExprWithParen(self, ctx:instructionParser.ExprWithParenContext):
        pass

    # Exit a parse tree produced by instructionParser#ExprWithParen.
    def exitExprWithParen(self, ctx:instructionParser.ExprWithParenContext):
        pass


    # Enter a parse tree produced by instructionParser#instruction.
    def enterInstruction(self, ctx:instructionParser.InstructionContext):
        pass

    # Exit a parse tree produced by instructionParser#instruction.
    def exitInstruction(self, ctx:instructionParser.InstructionContext):
        pass


