// Generated from SL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLParser}.
 */
public interface SLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(SLParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(SLParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SLParser.ExpContext ctx);
}