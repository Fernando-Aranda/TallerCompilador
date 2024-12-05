// Generated from com\fundamentos\cs\interprete\Digital.g4 by ANTLR 4.9.2
package com.fundamentos.cs.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.fundamentos.cs.interprete.ast.*;
	

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DigitalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DigitalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DigitalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DigitalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(DigitalParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(DigitalParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(DigitalParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(DigitalParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(DigitalParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(DigitalParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(DigitalParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DigitalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DigitalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DigitalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(DigitalParser.TermContext ctx);
}