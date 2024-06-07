// Generated from org/apache/doris/nereids/PLParser.g4 by ANTLR 4.9.3
package org.apache.doris.nereids;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLParser}.
 */
public interface PLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(PLParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(PLParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(PLParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(PLParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(PLParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(PLParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#procedure_block}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_block(PLParser.Procedure_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#procedure_block}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_block(PLParser.Procedure_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#doris_statement}.
	 * @param ctx the parse tree
	 */
	void enterDoris_statement(PLParser.Doris_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#doris_statement}.
	 * @param ctx the parse tree
	 */
	void exitDoris_statement(PLParser.Doris_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(PLParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(PLParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(PLParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(PLParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(PLParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(PLParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(PLParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(PLParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(PLParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(PLParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(PLParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(PLParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(PLParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(PLParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(PLParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(PLParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#assignment_stmt_collection_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_collection_item(PLParser.Assignment_stmt_collection_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#assignment_stmt_collection_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_collection_item(PLParser.Assignment_stmt_collection_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(PLParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(PLParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(PLParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(PLParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_cursor_stmt(PLParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_cursor_stmt(PLParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssociate_locator_stmt(PLParser.Associate_locator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssociate_locator_stmt(PLParser.Associate_locator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(PLParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(PLParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(PLParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(PLParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(PLParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(PLParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(PLParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(PLParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(PLParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(PLParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(PLParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(PLParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(PLParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(PLParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(PLParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(PLParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_item(PLParser.Declare_cursor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_item(PLParser.Declare_cursor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_with_return(PLParser.Cursor_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_with_return(PLParser.Cursor_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_without_return(PLParser.Cursor_without_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_without_return(PLParser.Cursor_without_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(PLParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(PLParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(PLParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(PLParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(PLParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(PLParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(PLParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(PLParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(PLParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(PLParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(PLParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(PLParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(PLParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(PLParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(PLParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(PLParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(PLParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(PLParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(PLParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(PLParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(PLParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(PLParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(PLParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(PLParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(PLParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(PLParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(PLParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(PLParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#drop_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure_stmt(PLParser.Drop_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#drop_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure_stmt(PLParser.Drop_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#show_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterShow_procedure_stmt(PLParser.Show_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#show_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitShow_procedure_stmt(PLParser.Show_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#show_create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterShow_create_procedure_stmt(PLParser.Show_create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#show_create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitShow_create_procedure_stmt(PLParser.Show_create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(PLParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(PLParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(PLParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(PLParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(PLParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(PLParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(PLParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(PLParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(PLParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(PLParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PLParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PLParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(PLParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(PLParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(PLParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(PLParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(PLParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(PLParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(PLParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(PLParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(PLParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(PLParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInclude_stmt(PLParser.Include_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInclude_stmt(PLParser.Include_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(PLParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(PLParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt(PLParser.Get_diag_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt(PLParser.Get_diag_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_item(PLParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_item(PLParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_exception_item(PLParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_exception_item(PLParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_rowcount_item(PLParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_rowcount_item(PLParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeave_stmt(PLParser.Leave_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeave_stmt(PLParser.Leave_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMap_object_stmt(PLParser.Map_object_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMap_object_stmt(PLParser.Map_object_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpen_stmt(PLParser.Open_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpen_stmt(PLParser.Open_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFetch_stmt(PLParser.Fetch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFetch_stmt(PLParser.Fetch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#fetch_limit}.
	 * @param ctx the parse tree
	 */
	void enterFetch_limit(PLParser.Fetch_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#fetch_limit}.
	 * @param ctx the parse tree
	 */
	void exitFetch_limit(PLParser.Fetch_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(PLParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(PLParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(PLParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(PLParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuit_stmt(PLParser.Quit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuit_stmt(PLParser.Quit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(PLParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(PLParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterResignal_stmt(PLParser.Resignal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitResignal_stmt(PLParser.Resignal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PLParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PLParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_option(PLParser.Set_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_option(PLParser.Set_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#set_doris_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_doris_session_option(PLParser.Set_doris_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#set_doris_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_doris_session_option(PLParser.Set_doris_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_current_schema_option(PLParser.Set_current_schema_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_current_schema_option(PLParser.Set_current_schema_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_mssql_session_option(PLParser.Set_mssql_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_mssql_session_option(PLParser.Set_mssql_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_teradata_session_option(PLParser.Set_teradata_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_teradata_session_option(PLParser.Set_teradata_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSignal_stmt(PLParser.Signal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSignal_stmt(PLParser.Signal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_into_stmt(PLParser.Values_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_into_stmt(PLParser.Values_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PLParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PLParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#unconditional_loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUnconditional_loop_stmt(PLParser.Unconditional_loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#unconditional_loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUnconditional_loop_stmt(PLParser.Unconditional_loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cursor_stmt(PLParser.For_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cursor_stmt(PLParser.For_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(PLParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(PLParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLabel_stmt(PLParser.Label_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLabel_stmt(PLParser.Label_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(PLParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(PLParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(PLParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(PLParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(PLParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(PLParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(PLParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(PLParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(PLParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(PLParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(PLParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(PLParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(PLParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(PLParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(PLParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(PLParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(PLParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(PLParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(PLParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(PLParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(PLParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(PLParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(PLParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(PLParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(PLParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(PLParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(PLParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(PLParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(PLParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(PLParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(PLParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(PLParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(PLParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(PLParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(PLParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(PLParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PLParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(PLParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(PLParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(PLParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(PLParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(PLParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(PLParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(PLParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(PLParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_dot}.
	 * @param ctx the parse tree
	 */
	void enterExpr_dot(PLParser.Expr_dotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_dot}.
	 * @param ctx the parse tree
	 */
	void exitExpr_dot(PLParser.Expr_dotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_dot_method_call}.
	 * @param ctx the parse tree
	 */
	void enterExpr_dot_method_call(PLParser.Expr_dot_method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_dot_method_call}.
	 * @param ctx the parse tree
	 */
	void exitExpr_dot_method_call(PLParser.Expr_dot_method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_dot_property_access}.
	 * @param ctx the parse tree
	 */
	void enterExpr_dot_property_access(PLParser.Expr_dot_property_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_dot_property_access}.
	 * @param ctx the parse tree
	 */
	void exitExpr_dot_property_access(PLParser.Expr_dot_property_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(PLParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(PLParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(PLParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(PLParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#host_pl}.
	 * @param ctx the parse tree
	 */
	void enterHost_pl(PLParser.Host_plContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#host_pl}.
	 * @param ctx the parse tree
	 */
	void exitHost_pl(PLParser.Host_plContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void enterHost_cmd(PLParser.Host_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void exitHost_cmd(PLParser.Host_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHost_stmt(PLParser.Host_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHost_stmt(PLParser.Host_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(PLParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(PLParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(PLParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(PLParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(PLParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(PLParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#ident_pl}.
	 * @param ctx the parse tree
	 */
	void enterIdent_pl(PLParser.Ident_plContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#ident_pl}.
	 * @param ctx the parse tree
	 */
	void exitIdent_pl(PLParser.Ident_plContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#qident}.
	 * @param ctx the parse tree
	 */
	void enterQident(PLParser.QidentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#qident}.
	 * @param ctx the parse tree
	 */
	void exitQident(PLParser.QidentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(PLParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(PLParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(PLParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(PLParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(PLParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(PLParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(PLParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(PLParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(PLParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(PLParser.Non_reserved_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#multiStatements}.
	 * @param ctx the parse tree
	 */
	void enterMultiStatements(PLParser.MultiStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#multiStatements}.
	 * @param ctx the parse tree
	 */
	void exitMultiStatements(PLParser.MultiStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(PLParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(PLParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBaseAlias}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBaseAlias(PLParser.StatementBaseAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBaseAlias}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBaseAlias(PLParser.StatementBaseAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallProcedure(PLParser.CallProcedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallProcedure(PLParser.CallProcedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(PLParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(PLParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(PLParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(PLParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showProcedureStatus}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureStatus(PLParser.ShowProcedureStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showProcedureStatus}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureStatus(PLParser.ShowProcedureStatusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateProcedure(PLParser.ShowCreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateProcedure(PLParser.ShowCreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(PLParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(PLParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createRowPolicy}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterCreateRowPolicy(PLParser.CreateRowPolicyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createRowPolicy}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitCreateRowPolicy(PLParser.CreateRowPolicyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(PLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(PLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(PLParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(PLParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterView}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(PLParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterView}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(PLParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(PLParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(PLParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertTable}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterInsertTable(PLParser.InsertTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertTable}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitInsertTable(PLParser.InsertTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code update}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(PLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code update}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(PLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code delete}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterDelete(PLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code delete}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitDelete(PLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code load}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterLoad(PLParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code load}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitLoad(PLParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mysqlLoad}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterMysqlLoad(PLParser.MysqlLoadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mysqlLoad}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitMysqlLoad(PLParser.MysqlLoadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code export}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterExport(PLParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code export}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitExport(PLParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterCreateMTMV(PLParser.CreateMTMVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitCreateMTMV(PLParser.CreateMTMVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterRefreshMTMV(PLParser.RefreshMTMVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitRefreshMTMV(PLParser.RefreshMTMVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterAlterMTMV(PLParser.AlterMTMVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitAlterMTMV(PLParser.AlterMTMVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterDropMTMV(PLParser.DropMTMVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitDropMTMV(PLParser.DropMTMVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pauseMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterPauseMTMV(PLParser.PauseMTMVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pauseMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitPauseMTMV(PLParser.PauseMTMVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resumeMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterResumeMTMV(PLParser.ResumeMTMVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resumeMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitResumeMTMV(PLParser.ResumeMTMVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cancelMTMVTask}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterCancelMTMVTask(PLParser.CancelMTMVTaskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cancelMTMVTask}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitCancelMTMVTask(PLParser.CancelMTMVTaskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraint(PLParser.AddConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraint(PLParser.AddConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraint(PLParser.DropConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraint(PLParser.DropConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterShowConstraint(PLParser.ShowConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitShowConstraint(PLParser.ShowConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsupported}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void enterUnsupported(PLParser.UnsupportedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsupported}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 */
	void exitUnsupported(PLParser.UnsupportedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDefaultStorageVault}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetDefaultStorageVault(PLParser.SetDefaultStorageVaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDefaultStorageVault}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetDefaultStorageVault(PLParser.SetDefaultStorageVaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setUserProperties}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetUserProperties(PLParser.SetUserPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setUserProperties}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetUserProperties(PLParser.SetUserPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setSystemVariableWithType}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariableWithType(PLParser.SetSystemVariableWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setSystemVariableWithType}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariableWithType(PLParser.SetSystemVariableWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setSystemVariableWithoutType}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariableWithoutType(PLParser.SetSystemVariableWithoutTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setSystemVariableWithoutType}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariableWithoutType(PLParser.SetSystemVariableWithoutTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetCharset(PLParser.SetCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetCharset(PLParser.SetCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNames(PLParser.SetNamesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNames(PLParser.SetNamesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(PLParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(PLParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setCollate}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetCollate(PLParser.SetCollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCollate}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetCollate(PLParser.SetCollateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(PLParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(PLParser.SetPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setLdapAdminPassword}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetLdapAdminPassword(PLParser.SetLdapAdminPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setLdapAdminPassword}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetLdapAdminPassword(PLParser.SetLdapAdminPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useDatabase}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseDatabase(PLParser.UseDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useDatabase}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseDatabase(PLParser.UseDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useCloudCluster}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseCloudCluster(PLParser.UseCloudClusterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useCloudCluster}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseCloudCluster(PLParser.UseCloudClusterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setSystemVariable}
	 * labeled alternative in {@link PLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariable(PLParser.SetSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setSystemVariable}
	 * labeled alternative in {@link PLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariable(PLParser.SetSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setUserVariable}
	 * labeled alternative in {@link PLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterSetUserVariable(PLParser.SetUserVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setUserVariable}
	 * labeled alternative in {@link PLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitSetUserVariable(PLParser.SetUserVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionAccessMode(PLParser.TransactionAccessModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionAccessMode(PLParser.TransactionAccessModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(PLParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(PLParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(PLParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(PLParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(PLParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(PLParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#partitionTable}.
	 * @param ctx the parse tree
	 */
	void enterPartitionTable(PLParser.PartitionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#partitionTable}.
	 * @param ctx the parse tree
	 */
	void exitPartitionTable(PLParser.PartitionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#identityOrFunctionList}.
	 * @param ctx the parse tree
	 */
	void enterIdentityOrFunctionList(PLParser.IdentityOrFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#identityOrFunctionList}.
	 * @param ctx the parse tree
	 */
	void exitIdentityOrFunctionList(PLParser.IdentityOrFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#identityOrFunction}.
	 * @param ctx the parse tree
	 */
	void enterIdentityOrFunction(PLParser.IdentityOrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#identityOrFunction}.
	 * @param ctx the parse tree
	 */
	void exitIdentityOrFunction(PLParser.IdentityOrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#dataDesc}.
	 * @param ctx the parse tree
	 */
	void enterDataDesc(PLParser.DataDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#dataDesc}.
	 * @param ctx the parse tree
	 */
	void exitDataDesc(PLParser.DataDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#buildMode}.
	 * @param ctx the parse tree
	 */
	void enterBuildMode(PLParser.BuildModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#buildMode}.
	 * @param ctx the parse tree
	 */
	void exitBuildMode(PLParser.BuildModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#refreshTrigger}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTrigger(PLParser.RefreshTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#refreshTrigger}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTrigger(PLParser.RefreshTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#refreshSchedule}.
	 * @param ctx the parse tree
	 */
	void enterRefreshSchedule(PLParser.RefreshScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#refreshSchedule}.
	 * @param ctx the parse tree
	 */
	void exitRefreshSchedule(PLParser.RefreshScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#refreshMethod}.
	 * @param ctx the parse tree
	 */
	void enterRefreshMethod(PLParser.RefreshMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#refreshMethod}.
	 * @param ctx the parse tree
	 */
	void exitRefreshMethod(PLParser.RefreshMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#identifierOrStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrStringLiteral(PLParser.IdentifierOrStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#identifierOrStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrStringLiteral(PLParser.IdentifierOrStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#identifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrText(PLParser.IdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#identifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrText(PLParser.IdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#userIdentify}.
	 * @param ctx the parse tree
	 */
	void enterUserIdentify(PLParser.UserIdentifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#userIdentify}.
	 * @param ctx the parse tree
	 */
	void exitUserIdentify(PLParser.UserIdentifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(PLParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(PLParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#planType}.
	 * @param ctx the parse tree
	 */
	void enterPlanType(PLParser.PlanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#planType}.
	 * @param ctx the parse tree
	 */
	void exitPlanType(PLParser.PlanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#mergeType}.
	 * @param ctx the parse tree
	 */
	void enterMergeType(PLParser.MergeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#mergeType}.
	 * @param ctx the parse tree
	 */
	void exitMergeType(PLParser.MergeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#preFilterClause}.
	 * @param ctx the parse tree
	 */
	void enterPreFilterClause(PLParser.PreFilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#preFilterClause}.
	 * @param ctx the parse tree
	 */
	void exitPreFilterClause(PLParser.PreFilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#deleteOnClause}.
	 * @param ctx the parse tree
	 */
	void enterDeleteOnClause(PLParser.DeleteOnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#deleteOnClause}.
	 * @param ctx the parse tree
	 */
	void exitDeleteOnClause(PLParser.DeleteOnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#sequenceColClause}.
	 * @param ctx the parse tree
	 */
	void enterSequenceColClause(PLParser.SequenceColClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#sequenceColClause}.
	 * @param ctx the parse tree
	 */
	void exitSequenceColClause(PLParser.SequenceColClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#colFromPath}.
	 * @param ctx the parse tree
	 */
	void enterColFromPath(PLParser.ColFromPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#colFromPath}.
	 * @param ctx the parse tree
	 */
	void exitColFromPath(PLParser.ColFromPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#colMappingList}.
	 * @param ctx the parse tree
	 */
	void enterColMappingList(PLParser.ColMappingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#colMappingList}.
	 * @param ctx the parse tree
	 */
	void exitColMappingList(PLParser.ColMappingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#mappingExpr}.
	 * @param ctx the parse tree
	 */
	void enterMappingExpr(PLParser.MappingExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#mappingExpr}.
	 * @param ctx the parse tree
	 */
	void exitMappingExpr(PLParser.MappingExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#withRemoteStorageSystem}.
	 * @param ctx the parse tree
	 */
	void enterWithRemoteStorageSystem(PLParser.WithRemoteStorageSystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#withRemoteStorageSystem}.
	 * @param ctx the parse tree
	 */
	void exitWithRemoteStorageSystem(PLParser.WithRemoteStorageSystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#resourceDesc}.
	 * @param ctx the parse tree
	 */
	void enterResourceDesc(PLParser.ResourceDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#resourceDesc}.
	 * @param ctx the parse tree
	 */
	void exitResourceDesc(PLParser.ResourceDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#mysqlDataDesc}.
	 * @param ctx the parse tree
	 */
	void enterMysqlDataDesc(PLParser.MysqlDataDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#mysqlDataDesc}.
	 * @param ctx the parse tree
	 */
	void exitMysqlDataDesc(PLParser.MysqlDataDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#skipLines}.
	 * @param ctx the parse tree
	 */
	void enterSkipLines(PLParser.SkipLinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#skipLines}.
	 * @param ctx the parse tree
	 */
	void exitSkipLines(PLParser.SkipLinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#outFileClause}.
	 * @param ctx the parse tree
	 */
	void enterOutFileClause(PLParser.OutFileClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#outFileClause}.
	 * @param ctx the parse tree
	 */
	void exitOutFileClause(PLParser.OutFileClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(PLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(PLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link PLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(PLParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link PLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(PLParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link PLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(PLParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link PLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(PLParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(PLParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(PLParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(PLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(PLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(PLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(PLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuesTable}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterValuesTable(PLParser.ValuesTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuesTable}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitValuesTable(PLParser.ValuesTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link PLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(PLParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link PLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(PLParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(PLParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(PLParser.CteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#aliasQuery}.
	 * @param ctx the parse tree
	 */
	void enterAliasQuery(PLParser.AliasQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#aliasQuery}.
	 * @param ctx the parse tree
	 */
	void exitAliasQuery(PLParser.AliasQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliases(PLParser.ColumnAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliases(PLParser.ColumnAliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(PLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(PLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#selectColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnClause(PLParser.SelectColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#selectColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnClause(PLParser.SelectColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(PLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(PLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(PLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(PLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(PLParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(PLParser.IntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#bulkCollectClause}.
	 * @param ctx the parse tree
	 */
	void enterBulkCollectClause(PLParser.BulkCollectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#bulkCollectClause}.
	 * @param ctx the parse tree
	 */
	void exitBulkCollectClause(PLParser.BulkCollectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#tableRow}.
	 * @param ctx the parse tree
	 */
	void enterTableRow(PLParser.TableRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#tableRow}.
	 * @param ctx the parse tree
	 */
	void exitTableRow(PLParser.TableRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#relations}.
	 * @param ctx the parse tree
	 */
	void enterRelations(PLParser.RelationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#relations}.
	 * @param ctx the parse tree
	 */
	void exitRelations(PLParser.RelationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(PLParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(PLParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(PLParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(PLParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketDistributeType}
	 * labeled alternative in {@link PLParser#distributeType}.
	 * @param ctx the parse tree
	 */
	void enterBracketDistributeType(PLParser.BracketDistributeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketDistributeType}
	 * labeled alternative in {@link PLParser#distributeType}.
	 * @param ctx the parse tree
	 */
	void exitBracketDistributeType(PLParser.BracketDistributeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentDistributeType}
	 * labeled alternative in {@link PLParser#distributeType}.
	 * @param ctx the parse tree
	 */
	void enterCommentDistributeType(PLParser.CommentDistributeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentDistributeType}
	 * labeled alternative in {@link PLParser#distributeType}.
	 * @param ctx the parse tree
	 */
	void exitCommentDistributeType(PLParser.CommentDistributeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketRelationHint}
	 * labeled alternative in {@link PLParser#relationHint}.
	 * @param ctx the parse tree
	 */
	void enterBracketRelationHint(PLParser.BracketRelationHintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketRelationHint}
	 * labeled alternative in {@link PLParser#relationHint}.
	 * @param ctx the parse tree
	 */
	void exitBracketRelationHint(PLParser.BracketRelationHintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentRelationHint}
	 * labeled alternative in {@link PLParser#relationHint}.
	 * @param ctx the parse tree
	 */
	void enterCommentRelationHint(PLParser.CommentRelationHintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentRelationHint}
	 * labeled alternative in {@link PLParser#relationHint}.
	 * @param ctx the parse tree
	 */
	void exitCommentRelationHint(PLParser.CommentRelationHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#aggClause}.
	 * @param ctx the parse tree
	 */
	void enterAggClause(PLParser.AggClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#aggClause}.
	 * @param ctx the parse tree
	 */
	void exitAggClause(PLParser.AggClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterGroupingElement(PLParser.GroupingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitGroupingElement(PLParser.GroupingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(PLParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(PLParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(PLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(PLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#selectHint}.
	 * @param ctx the parse tree
	 */
	void enterSelectHint(PLParser.SelectHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#selectHint}.
	 * @param ctx the parse tree
	 */
	void exitSelectHint(PLParser.SelectHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(PLParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(PLParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#hintAssignment}.
	 * @param ctx the parse tree
	 */
	void enterHintAssignment(PLParser.HintAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#hintAssignment}.
	 * @param ctx the parse tree
	 */
	void exitHintAssignment(PLParser.HintAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#updateAssignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdateAssignment(PLParser.UpdateAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#updateAssignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdateAssignment(PLParser.UpdateAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#updateAssignmentSeq}.
	 * @param ctx the parse tree
	 */
	void enterUpdateAssignmentSeq(PLParser.UpdateAssignmentSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#updateAssignmentSeq}.
	 * @param ctx the parse tree
	 */
	void exitUpdateAssignmentSeq(PLParser.UpdateAssignmentSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(PLParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(PLParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(PLParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(PLParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void enterSortClause(PLParser.SortClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void exitSortClause(PLParser.SortClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(PLParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(PLParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(PLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(PLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(PLParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(PLParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(PLParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(PLParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(PLParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(PLParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PLParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PLParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(PLParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(PLParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#optScanParams}.
	 * @param ctx the parse tree
	 */
	void enterOptScanParams(PLParser.OptScanParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#optScanParams}.
	 * @param ctx the parse tree
	 */
	void exitOptScanParams(PLParser.OptScanParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(PLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(PLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(PLParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(PLParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(PLParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(PLParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationList}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterRelationList(PLParser.RelationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationList}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitRelationList(PLParser.RelationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#materializedViewName}.
	 * @param ctx the parse tree
	 */
	void enterMaterializedViewName(PLParser.MaterializedViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#materializedViewName}.
	 * @param ctx the parse tree
	 */
	void exitMaterializedViewName(PLParser.MaterializedViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#propertyClause}.
	 * @param ctx the parse tree
	 */
	void enterPropertyClause(PLParser.PropertyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#propertyClause}.
	 * @param ctx the parse tree
	 */
	void exitPropertyClause(PLParser.PropertyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#propertyItemList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyItemList(PLParser.PropertyItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#propertyItemList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyItemList(PLParser.PropertyItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#propertyItem}.
	 * @param ctx the parse tree
	 */
	void enterPropertyItem(PLParser.PropertyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#propertyItem}.
	 * @param ctx the parse tree
	 */
	void exitPropertyItem(PLParser.PropertyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void enterPropertyKey(PLParser.PropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void exitPropertyKey(PLParser.PropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(PLParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(PLParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(PLParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(PLParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(PLParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(PLParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#simpleColumnDefs}.
	 * @param ctx the parse tree
	 */
	void enterSimpleColumnDefs(PLParser.SimpleColumnDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#simpleColumnDefs}.
	 * @param ctx the parse tree
	 */
	void exitSimpleColumnDefs(PLParser.SimpleColumnDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#simpleColumnDef}.
	 * @param ctx the parse tree
	 */
	void enterSimpleColumnDef(PLParser.SimpleColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#simpleColumnDef}.
	 * @param ctx the parse tree
	 */
	void exitSimpleColumnDef(PLParser.SimpleColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#columnDefs}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefs(PLParser.ColumnDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#columnDefs}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefs(PLParser.ColumnDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(PLParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(PLParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#indexDefs}.
	 * @param ctx the parse tree
	 */
	void enterIndexDefs(PLParser.IndexDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#indexDefs}.
	 * @param ctx the parse tree
	 */
	void exitIndexDefs(PLParser.IndexDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#indexDef}.
	 * @param ctx the parse tree
	 */
	void enterIndexDef(PLParser.IndexDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#indexDef}.
	 * @param ctx the parse tree
	 */
	void exitIndexDef(PLParser.IndexDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#partitionsDef}.
	 * @param ctx the parse tree
	 */
	void enterPartitionsDef(PLParser.PartitionsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#partitionsDef}.
	 * @param ctx the parse tree
	 */
	void exitPartitionsDef(PLParser.PartitionsDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#partitionDef}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDef(PLParser.PartitionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#partitionDef}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDef(PLParser.PartitionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#lessThanPartitionDef}.
	 * @param ctx the parse tree
	 */
	void enterLessThanPartitionDef(PLParser.LessThanPartitionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#lessThanPartitionDef}.
	 * @param ctx the parse tree
	 */
	void exitLessThanPartitionDef(PLParser.LessThanPartitionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#fixedPartitionDef}.
	 * @param ctx the parse tree
	 */
	void enterFixedPartitionDef(PLParser.FixedPartitionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#fixedPartitionDef}.
	 * @param ctx the parse tree
	 */
	void exitFixedPartitionDef(PLParser.FixedPartitionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#stepPartitionDef}.
	 * @param ctx the parse tree
	 */
	void enterStepPartitionDef(PLParser.StepPartitionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#stepPartitionDef}.
	 * @param ctx the parse tree
	 */
	void exitStepPartitionDef(PLParser.StepPartitionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#inPartitionDef}.
	 * @param ctx the parse tree
	 */
	void enterInPartitionDef(PLParser.InPartitionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#inPartitionDef}.
	 * @param ctx the parse tree
	 */
	void exitInPartitionDef(PLParser.InPartitionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#constantSeq}.
	 * @param ctx the parse tree
	 */
	void enterConstantSeq(PLParser.ConstantSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#constantSeq}.
	 * @param ctx the parse tree
	 */
	void exitConstantSeq(PLParser.ConstantSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#partitionValueDef}.
	 * @param ctx the parse tree
	 */
	void enterPartitionValueDef(PLParser.PartitionValueDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#partitionValueDef}.
	 * @param ctx the parse tree
	 */
	void exitPartitionValueDef(PLParser.PartitionValueDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#rollupDefs}.
	 * @param ctx the parse tree
	 */
	void enterRollupDefs(PLParser.RollupDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#rollupDefs}.
	 * @param ctx the parse tree
	 */
	void exitRollupDefs(PLParser.RollupDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#rollupDef}.
	 * @param ctx the parse tree
	 */
	void enterRollupDef(PLParser.RollupDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#rollupDef}.
	 * @param ctx the parse tree
	 */
	void exitRollupDef(PLParser.RollupDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#aggTypeDef}.
	 * @param ctx the parse tree
	 */
	void enterAggTypeDef(PLParser.AggTypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#aggTypeDef}.
	 * @param ctx the parse tree
	 */
	void exitAggTypeDef(PLParser.AggTypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#tabletList}.
	 * @param ctx the parse tree
	 */
	void enterTabletList(PLParser.TabletListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#tabletList}.
	 * @param ctx the parse tree
	 */
	void exitTabletList(PLParser.TabletListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(PLParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(PLParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(PLParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(PLParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(PLParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(PLParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(PLParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(PLParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exist}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExist(PLParser.ExistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exist}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExist(PLParser.ExistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(PLParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(PLParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(PLParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(PLParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isnull}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsnull(PLParser.IsnullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isnull}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsnull(PLParser.IsnullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is_not_null_pred}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterIs_not_null_pred(PLParser.Is_not_null_predContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is_not_null_pred}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitIs_not_null_pred(PLParser.Is_not_null_predContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(PLParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(PLParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doublePipes}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterDoublePipes(PLParser.DoublePipesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doublePipes}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitDoublePipes(PLParser.DoublePipesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#rowConstructor}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(PLParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#rowConstructor}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(PLParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#rowConstructorItem}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructorItem(PLParser.RowConstructorItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#rowConstructorItem}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructorItem(PLParser.RowConstructorItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(PLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(PLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(PLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(PLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOperation}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOperation(PLParser.BitOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOperation}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOperation(PLParser.BitOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(PLParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(PLParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(PLParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(PLParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#datetimeUnit}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeUnit(PLParser.DatetimeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#datetimeUnit}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeUnit(PLParser.DatetimeUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateCeil}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDateCeil(PLParser.DateCeilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateCeil}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDateCeil(PLParser.DateCeilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(PLParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(PLParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDate}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDate(PLParser.CurrentDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDate}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDate(PLParser.CurrentDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimestampadd(PLParser.TimestampaddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimestampadd(PLParser.TimestampaddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date_sub}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDate_sub(PLParser.Date_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date_sub}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDate_sub(PLParser.Date_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(PLParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(PLParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(PLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(PLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userVariable}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(PLParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userVariable}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(PLParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAt}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementAt(PLParser.ElementAtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAt}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementAt(PLParser.ElementAtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localTimestamp}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLocalTimestamp(PLParser.LocalTimestampContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localTimestamp}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLocalTimestamp(PLParser.LocalTimestampContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charFunction}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(PLParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFunction}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(PLParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(PLParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(PLParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayRange}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayRange(PLParser.ArrayRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayRange}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayRange(PLParser.ArrayRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(PLParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(PLParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(PLParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(PLParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(PLParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(PLParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code convertType}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConvertType(PLParser.ConvertTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code convertType}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConvertType(PLParser.ConvertTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimestampdiff(PLParser.TimestampdiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimestampdiff(PLParser.TimestampdiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code convertCharSet}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConvertCharSet(PLParser.ConvertCharSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code convertCharSet}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConvertCharSet(PLParser.ConvertCharSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(PLParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(PLParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code encryptKey}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterEncryptKey(PLParser.EncryptKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code encryptKey}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitEncryptKey(PLParser.EncryptKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date_add}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDate_add(PLParser.Date_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date_add}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDate_add(PLParser.Date_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentTime}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentTime(PLParser.CurrentTimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentTime}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentTime(PLParser.CurrentTimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localTime}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLocalTime(PLParser.LocalTimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localTime}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLocalTime(PLParser.LocalTimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code systemVariable}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariable(PLParser.SystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code systemVariable}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariable(PLParser.SystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collate}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCollate(PLParser.CollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collate}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCollate(PLParser.CollateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUser(PLParser.CurrentUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUser(PLParser.CurrentUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(PLParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(PLParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(PLParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(PLParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentTimestamp}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentTimestamp(PLParser.CurrentTimestampContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentTimestamp}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentTimestamp(PLParser.CurrentTimestampContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraySlice}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArraySlice(PLParser.ArraySliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraySlice}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArraySlice(PLParser.ArraySliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateFloor}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDateFloor(PLParser.DateFloorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateFloor}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDateFloor(PLParser.DateFloorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(PLParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(PLParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(PLParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(PLParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(PLParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(PLParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#functionNameIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameIdentifier(PLParser.FunctionNameIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#functionNameIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameIdentifier(PLParser.FunctionNameIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpec(PLParser.WindowSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpec(PLParser.WindowSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(PLParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(PLParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#frameUnits}.
	 * @param ctx the parse tree
	 */
	void enterFrameUnits(PLParser.FrameUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#frameUnits}.
	 * @param ctx the parse tree
	 */
	void exitFrameUnits(PLParser.FrameUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#frameBoundary}.
	 * @param ctx the parse tree
	 */
	void enterFrameBoundary(PLParser.FrameBoundaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#frameBoundary}.
	 * @param ctx the parse tree
	 */
	void exitFrameBoundary(PLParser.FrameBoundaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(PLParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(PLParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#specifiedPartition}.
	 * @param ctx the parse tree
	 */
	void enterSpecifiedPartition(PLParser.SpecifiedPartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#specifiedPartition}.
	 * @param ctx the parse tree
	 */
	void exitSpecifiedPartition(PLParser.SpecifiedPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(PLParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(PLParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(PLParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(PLParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(PLParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(PLParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(PLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(PLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(PLParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(PLParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterMapLiteral(PLParser.MapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitMapLiteral(PLParser.MapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStructLiteral(PLParser.StructLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStructLiteral(PLParser.StructLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(PLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(PLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(PLParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(PLParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(PLParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(PLParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(PLParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(PLParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#unitIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnitIdentifier(PLParser.UnitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#unitIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnitIdentifier(PLParser.UnitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#dataTypeWithNullable}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeWithNullable(PLParser.DataTypeWithNullableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#dataTypeWithNullable}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeWithNullable(PLParser.DataTypeWithNullableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(PLParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(PLParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggStateDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterAggStateDataType(PLParser.AggStateDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggStateDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitAggStateDataType(PLParser.AggStateDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(PLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(PLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#primitiveColType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveColType(PLParser.PrimitiveColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#primitiveColType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveColType(PLParser.PrimitiveColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(PLParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(PLParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(PLParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(PLParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(PLParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(PLParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(PLParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(PLParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link PLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(PLParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link PLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(PLParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link PLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(PLParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link PLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(PLParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(PLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(PLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link PLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(PLParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link PLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(PLParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link PLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(PLParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link PLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(PLParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link PLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(PLParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link PLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(PLParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link PLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(PLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link PLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(PLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(PLParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(PLParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link PLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(PLParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link PLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(PLParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link PLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(PLParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link PLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(PLParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(PLParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(PLParser.NonReservedContext ctx);
}