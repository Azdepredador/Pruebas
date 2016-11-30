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
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull HelloParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull HelloParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull HelloParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull HelloParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull HelloParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull HelloParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(@NotNull HelloParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(@NotNull HelloParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull HelloParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull HelloParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull HelloParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull HelloParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull HelloParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull HelloParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterTerm2(@NotNull HelloParser.Term2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitTerm2(@NotNull HelloParser.Term2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull HelloParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull HelloParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull HelloParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#termPri}.
	 * @param ctx the parse tree
	 */
	void enterTermPri(@NotNull HelloParser.TermPriContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#termPri}.
	 * @param ctx the parse tree
	 */
	void exitTermPri(@NotNull HelloParser.TermPriContext ctx);
}