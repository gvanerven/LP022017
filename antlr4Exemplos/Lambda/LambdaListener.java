// Generated from Lambda.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LambdaParser}.
 */
public interface LambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LambdaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LambdaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LambdaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LambdaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LambdaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LambdaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LambdaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LambdaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LambdaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(LambdaParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(LambdaParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LambdaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LambdaParser.VariableContext ctx);
}