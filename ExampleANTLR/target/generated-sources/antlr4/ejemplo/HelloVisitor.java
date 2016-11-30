// Generated from Hello.g4 by ANTLR 4.4

	package ejemplo;	
	import java.util.Map;
	import java.util.HashMap;
	import abstracto.ASTNode;
	import abstracto.Addition;
	import abstracto.If;
	import abstracto.Multiplication;
	import abstracto.Println;
	import abstracto.Constant;
	import abstracto.varDecl;
	import abstracto.VarAssign;
	import abstracto.VarRef;
	import abstracto.Comparator;
	import abstracto.ComparatorDoble;
	import abstracto.DeleteTable;
	
	

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(@NotNull HelloParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(@NotNull HelloParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(@NotNull HelloParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expresionPri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionPri(@NotNull HelloParser.ExpresionPriContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(@NotNull HelloParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(@NotNull HelloParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(@NotNull HelloParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(@NotNull HelloParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm2(@NotNull HelloParser.Term2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull HelloParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factorPri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorPri(@NotNull HelloParser.FactorPriContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(@NotNull HelloParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull HelloParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#termPri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermPri(@NotNull HelloParser.TermPriContext ctx);
}