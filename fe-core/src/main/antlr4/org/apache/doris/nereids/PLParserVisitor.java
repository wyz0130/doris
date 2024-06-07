// Generated from org/apache/doris/nereids/PLParser.g4 by ANTLR 4.9.3
package org.apache.doris.nereids;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(PLParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(PLParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(PLParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#procedure_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_block(PLParser.Procedure_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#doris_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoris_statement(PLParser.Doris_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(PLParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(PLParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(PLParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(PLParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PLParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(PLParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(PLParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(PLParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#assignment_stmt_collection_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_collection_item(PLParser.Assignment_stmt_collection_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(PLParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(PLParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_cursor_stmt(PLParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_locator_stmt(PLParser.Associate_locator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PLParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(PLParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(PLParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(PLParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(PLParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(PLParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(PLParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(PLParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(PLParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(PLParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(PLParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(PLParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(PLParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(PLParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(PLParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(PLParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(PLParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(PLParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(PLParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(PLParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(PLParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(PLParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(PLParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(PLParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(PLParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#drop_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure_stmt(PLParser.Drop_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#show_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_procedure_stmt(PLParser.Show_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#show_create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_create_procedure_stmt(PLParser.Show_create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(PLParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(PLParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(PLParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(PLParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(PLParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PLParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(PLParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(PLParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(PLParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(PLParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(PLParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_stmt(PLParser.Include_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(PLParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt(PLParser.Get_diag_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_item(PLParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_exception_item(PLParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_rowcount_item(PLParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#leave_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_stmt(PLParser.Leave_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#map_object_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_object_stmt(PLParser.Map_object_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#open_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_stmt(PLParser.Open_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(PLParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#fetch_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_limit(PLParser.Fetch_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(PLParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(PLParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#quit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_stmt(PLParser.Quit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(PLParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#resignal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignal_stmt(PLParser.Resignal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PLParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(PLParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#set_doris_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_doris_session_option(PLParser.Set_doris_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(PLParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(PLParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(PLParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#signal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_stmt(PLParser.Signal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#values_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_into_stmt(PLParser.Values_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PLParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#unconditional_loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconditional_loop_stmt(PLParser.Unconditional_loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(PLParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(PLParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#label_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_stmt(PLParser.Label_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(PLParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(PLParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(PLParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(PLParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(PLParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(PLParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(PLParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(PLParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(PLParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(PLParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(PLParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(PLParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(PLParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(PLParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(PLParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(PLParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(PLParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(PLParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(PLParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(PLParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(PLParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(PLParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(PLParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_dot(PLParser.Expr_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_dot_method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_dot_method_call(PLParser.Expr_dot_method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_dot_property_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_dot_property_access(PLParser.Expr_dot_property_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(PLParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(PLParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#host_pl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_pl(PLParser.Host_plContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#host_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_cmd(PLParser.Host_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#host_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_stmt(PLParser.Host_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(PLParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(PLParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(PLParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#ident_pl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_pl(PLParser.Ident_plContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#qident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQident(PLParser.QidentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(PLParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(PLParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(PLParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(PLParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(PLParser.Non_reserved_wordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#multiStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStatements(PLParser.MultiStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(PLParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBaseAlias}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBaseAlias(PLParser.StatementBaseAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallProcedure(PLParser.CallProcedureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(PLParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(PLParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showProcedureStatus}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcedureStatus(PLParser.ShowProcedureStatusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateProcedure}
	 * labeled alternative in {@link PLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateProcedure(PLParser.ShowCreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(PLParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createRowPolicy}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRowPolicy(PLParser.CreateRowPolicyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(PLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(PLParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterView}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(PLParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(PLParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertTable}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertTable(PLParser.InsertTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code update}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(PLParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delete}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(PLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code load}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(PLParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mysqlLoad}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlLoad(PLParser.MysqlLoadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code export}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(PLParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMTMV(PLParser.CreateMTMVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMTMV(PLParser.RefreshMTMVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMTMV(PLParser.AlterMTMVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMTMV(PLParser.DropMTMVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pauseMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPauseMTMV(PLParser.PauseMTMVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resumeMTMV}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumeMTMV(PLParser.ResumeMTMVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cancelMTMVTask}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelMTMVTask(PLParser.CancelMTMVTaskContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraint(PLParser.AddConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraint(PLParser.DropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showConstraint}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowConstraint(PLParser.ShowConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsupported}
	 * labeled alternative in {@link PLParser#statementBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupported(PLParser.UnsupportedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDefaultStorageVault}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDefaultStorageVault(PLParser.SetDefaultStorageVaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setUserProperties}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUserProperties(PLParser.SetUserPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSystemVariableWithType}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVariableWithType(PLParser.SetSystemVariableWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSystemVariableWithoutType}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVariableWithoutType(PLParser.SetSystemVariableWithoutTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCharset(PLParser.SetCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNames(PLParser.SetNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(PLParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setCollate}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCollate(PLParser.SetCollateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPassword(PLParser.SetPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setLdapAdminPassword}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLdapAdminPassword(PLParser.SetLdapAdminPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useDatabase}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabase(PLParser.UseDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useCloudCluster}
	 * labeled alternative in {@link PLParser#unsupportedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseCloudCluster(PLParser.UseCloudClusterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setSystemVariable}
	 * labeled alternative in {@link PLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVariable(PLParser.SetSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setUserVariable}
	 * labeled alternative in {@link PLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetUserVariable(PLParser.SetUserVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionAccessMode(PLParser.TransactionAccessModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#isolationLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(PLParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(PLParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(PLParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#partitionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionTable(PLParser.PartitionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#identityOrFunctionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityOrFunctionList(PLParser.IdentityOrFunctionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#identityOrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityOrFunction(PLParser.IdentityOrFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#dataDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDesc(PLParser.DataDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#buildMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildMode(PLParser.BuildModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#refreshTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTrigger(PLParser.RefreshTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#refreshSchedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshSchedule(PLParser.RefreshScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#refreshMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMethod(PLParser.RefreshMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#identifierOrStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrStringLiteral(PLParser.IdentifierOrStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#identifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrText(PLParser.IdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#userIdentify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserIdentify(PLParser.UserIdentifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(PLParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#planType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanType(PLParser.PlanTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#mergeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeType(PLParser.MergeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#preFilterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFilterClause(PLParser.PreFilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#deleteOnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteOnClause(PLParser.DeleteOnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#sequenceColClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceColClause(PLParser.SequenceColClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#colFromPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColFromPath(PLParser.ColFromPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#colMappingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColMappingList(PLParser.ColMappingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#mappingExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingExpr(PLParser.MappingExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#withRemoteStorageSystem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithRemoteStorageSystem(PLParser.WithRemoteStorageSystemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#resourceDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceDesc(PLParser.ResourceDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#mysqlDataDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlDataDesc(PLParser.MysqlDataDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#skipLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipLines(PLParser.SkipLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#outFileClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutFileClause(PLParser.OutFileClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(PLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link PLParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(PLParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link PLParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(PLParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(PLParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(PLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(PLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuesTable}
	 * labeled alternative in {@link PLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesTable(PLParser.ValuesTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link PLParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularQuerySpecification(PLParser.RegularQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#cte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte(PLParser.CteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#aliasQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasQuery(PLParser.AliasQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#columnAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliases(PLParser.ColumnAliasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(PLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#selectColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnClause(PLParser.SelectColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(PLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(PLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(PLParser.IntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#bulkCollectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulkCollectClause(PLParser.BulkCollectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#tableRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRow(PLParser.TableRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#relations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelations(PLParser.RelationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(PLParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(PLParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketDistributeType}
	 * labeled alternative in {@link PLParser#distributeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketDistributeType(PLParser.BracketDistributeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentDistributeType}
	 * labeled alternative in {@link PLParser#distributeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentDistributeType(PLParser.CommentDistributeTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketRelationHint}
	 * labeled alternative in {@link PLParser#relationHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketRelationHint(PLParser.BracketRelationHintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentRelationHint}
	 * labeled alternative in {@link PLParser#relationHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentRelationHint(PLParser.CommentRelationHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#aggClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggClause(PLParser.AggClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingElement(PLParser.GroupingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(PLParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(PLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#selectHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectHint(PLParser.SelectHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#hintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintStatement(PLParser.HintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#hintAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintAssignment(PLParser.HintAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#updateAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateAssignment(PLParser.UpdateAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#updateAssignmentSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateAssignmentSeq(PLParser.UpdateAssignmentSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(PLParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(PLParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#sortClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortClause(PLParser.SortClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(PLParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(PLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(PLParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(PLParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(PLParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(PLParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(PLParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#optScanParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptScanParams(PLParser.OptScanParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(PLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(PLParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValuedFunction(PLParser.TableValuedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationList}
	 * labeled alternative in {@link PLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationList(PLParser.RelationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#materializedViewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterializedViewName(PLParser.MaterializedViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#propertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyClause(PLParser.PropertyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#propertyItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyItemList(PLParser.PropertyItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#propertyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyItem(PLParser.PropertyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#propertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyKey(PLParser.PropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValue(PLParser.PropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(PLParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifier(PLParser.MultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#simpleColumnDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleColumnDefs(PLParser.SimpleColumnDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#simpleColumnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleColumnDef(PLParser.SimpleColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#columnDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefs(PLParser.ColumnDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(PLParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#indexDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDefs(PLParser.IndexDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#indexDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDef(PLParser.IndexDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#partitionsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionsDef(PLParser.PartitionsDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#partitionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDef(PLParser.PartitionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#lessThanPartitionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanPartitionDef(PLParser.LessThanPartitionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#fixedPartitionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPartitionDef(PLParser.FixedPartitionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#stepPartitionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepPartitionDef(PLParser.StepPartitionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#inPartitionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPartitionDef(PLParser.InPartitionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#constantSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantSeq(PLParser.ConstantSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#partitionValueDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionValueDef(PLParser.PartitionValueDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#rollupDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollupDefs(PLParser.RollupDefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#rollupDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollupDef(PLParser.RollupDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#aggTypeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggTypeDef(PLParser.AggTypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#tabletList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabletList(PLParser.TabletListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(PLParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(PLParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(PLParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(PLParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exist}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist(PLParser.ExistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(PLParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(PLParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isnull}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsnull(PLParser.IsnullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is_not_null_pred}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_not_null_pred(PLParser.Is_not_null_predContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(PLParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doublePipes}
	 * labeled alternative in {@link PLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoublePipes(PLParser.DoublePipesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#rowConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(PLParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#rowConstructorItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructorItem(PLParser.RowConstructorItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(PLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(PLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PLParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitOperation}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOperation(PLParser.BitOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(PLParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link PLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(PLParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#datetimeUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeUnit(PLParser.DatetimeUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateCeil}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateCeil(PLParser.DateCeilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(PLParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentDate}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDate(PLParser.CurrentDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampadd(PLParser.TimestampaddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date_sub}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_sub(PLParser.Date_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(PLParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(PLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userVariable}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(PLParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementAt}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAt(PLParser.ElementAtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localTimestamp}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTimestamp(PLParser.LocalTimestampContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charFunction}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(PLParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(PLParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayRange}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRange(PLParser.ArrayRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(PLParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(PLParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(PLParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code convertType}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertType(PLParser.ConvertTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampdiff(PLParser.TimestampdiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code convertCharSet}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertCharSet(PLParser.ConvertCharSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(PLParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code encryptKey}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptKey(PLParser.EncryptKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date_add}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_add(PLParser.Date_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentTime}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentTime(PLParser.CurrentTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localTime}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTime(PLParser.LocalTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code systemVariable}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariable(PLParser.SystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collate}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate(PLParser.CollateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentUser}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUser(PLParser.CurrentUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(PLParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(PLParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentTimestamp}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentTimestamp(PLParser.CurrentTimestampContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraySlice}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySlice(PLParser.ArraySliceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateFloor}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateFloor(PLParser.DateFloorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link PLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(PLParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(PLParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(PLParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#functionNameIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNameIdentifier(PLParser.FunctionNameIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpec(PLParser.WindowSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(PLParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#frameUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameUnits(PLParser.FrameUnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#frameBoundary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBoundary(PLParser.FrameBoundaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(PLParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#specifiedPartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifiedPartition(PLParser.SpecifiedPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(PLParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(PLParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(PLParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(PLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(PLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(PLParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteral(PLParser.MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structLiteral}
	 * labeled alternative in {@link PLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructLiteral(PLParser.StructLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(PLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(PLParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(PLParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(PLParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#unitIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitIdentifier(PLParser.UnitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#dataTypeWithNullable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeWithNullable(PLParser.DataTypeWithNullableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(PLParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggStateDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggStateDataType(PLParser.AggStateDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link PLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(PLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#primitiveColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveColType(PLParser.PrimitiveColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColTypeList(PLParser.ComplexColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#complexColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColType(PLParser.ComplexColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#commentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentSpec(PLParser.CommentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(PLParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link PLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByPercentile(PLParser.SampleByPercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link PLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByRows(PLParser.SampleByRowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingIdentifier(PLParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link PLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorIdent(PLParser.ErrorIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link PLParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealIdent(PLParser.RealIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link PLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(PLParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link PLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(PLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(PLParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link PLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(PLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link PLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(PLParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(PLParser.NonReservedContext ctx);
}