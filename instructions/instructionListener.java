// Generated from instruction.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link instructionParser}.
 */
public interface instructionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link instructionParser#state_var}.
	 * @param ctx the parse tree
	 */
	void enterState_var(instructionParser.State_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#state_var}.
	 * @param ctx the parse tree
	 */
	void exitState_var(instructionParser.State_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#packet_field}.
	 * @param ctx the parse tree
	 */
	void enterPacket_field(instructionParser.Packet_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#packet_field}.
	 * @param ctx the parse tree
	 */
	void exitPacket_field(instructionParser.Packet_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#state_var_with_comma}.
	 * @param ctx the parse tree
	 */
	void enterState_var_with_comma(instructionParser.State_var_with_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#state_var_with_comma}.
	 * @param ctx the parse tree
	 */
	void exitState_var_with_comma(instructionParser.State_var_with_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#state_vars}.
	 * @param ctx the parse tree
	 */
	void enterState_vars(instructionParser.State_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#state_vars}.
	 * @param ctx the parse tree
	 */
	void exitState_vars(instructionParser.State_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#packet_field_with_comma}.
	 * @param ctx the parse tree
	 */
	void enterPacket_field_with_comma(instructionParser.Packet_field_with_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#packet_field_with_comma}.
	 * @param ctx the parse tree
	 */
	void exitPacket_field_with_comma(instructionParser.Packet_field_with_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#packet_fields}.
	 * @param ctx the parse tree
	 */
	void enterPacket_fields(instructionParser.Packet_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#packet_fields}.
	 * @param ctx the parse tree
	 */
	void exitPacket_fields(instructionParser.Packet_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#guarded_update_with_comma}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_update_with_comma(instructionParser.Guarded_update_with_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#guarded_update_with_comma}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_update_with_comma(instructionParser.Guarded_update_with_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#guarded_updates}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_updates(instructionParser.Guarded_updatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#guarded_updates}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_updates(instructionParser.Guarded_updatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#guarded_update}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_update(instructionParser.Guarded_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#guarded_update}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_update(instructionParser.Guarded_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(instructionParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(instructionParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(instructionParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(instructionParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(instructionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(instructionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link instructionParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(instructionParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link instructionParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(instructionParser.InstructionContext ctx);
}