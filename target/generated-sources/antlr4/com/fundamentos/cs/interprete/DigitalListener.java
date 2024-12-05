// Generated from Digital.g4 by ANTLR 4.4
package com.fundamentos.cs.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.fundamentos.cs.interprete.ast.*;
	

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DigitalParser}.
 */
public interface DigitalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DigitalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull DigitalParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull DigitalParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull DigitalParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull DigitalParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull DigitalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull DigitalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull DigitalParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull DigitalParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(@NotNull DigitalParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(@NotNull DigitalParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull DigitalParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull DigitalParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull DigitalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull DigitalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DigitalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DigitalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(@NotNull DigitalParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(@NotNull DigitalParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull DigitalParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull DigitalParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DigitalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull DigitalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DigitalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull DigitalParser.FactorContext ctx);
}