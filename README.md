# 
Two main classes with EvoTestGenerator, and QuixBugExtendedOracle.

## Class  EvoTestGenerator

### Evosuite test output:

This class generates test cases using Evosuite.

The test cases generated are written in folder:

\<Selected_output\>/seed_X/evosuite-tests/java_programs/\<Program_to_repair\>_ESTest.java

Selected_output= by default the output is "./out/"


### QuixBugExtendedOracle

The class QuixBugExtendedOracle runs EvosuiteTest generation for generating test cases, and runs a patched version of a program over it.

### preconditions

| program | preconditions|
| --- |---|
|depth_first_search||
|find_in_sorted|a sorted list of ints|
|get_factors|n int greater than 1|
|is_valid_parenthesization|paren in '()'|
|knapsack||
|levenshtein||
|lis|the ints in arr are unique|
|mergesort||
|next_permutation|perm is not sorted in reverse order|
|powerset|array has no duplicate elements|
|quicksort|the ints in arr are unique|
|rpn_eval|token in ('+', '-', '*', '/')|

### failing evosuite

| program | failing tests in seed|reason|
| --- |---| --- |
| flatten |seed 2(Test 2)|
|hanoi | seed 10(Test 2)  |Timeout/Error reading the validation process |




### patch evaluation



### Evosuite Paramters
| evosuite parameters | 
| --- |
|	CP	|
|	CP_file_path	|
|	OUTPUT_DIR	|
|	PROJECT_DIR	|
|	PROJECT_PREFIX	|
|	TARGET_CLASS	|
|	TARGET_CLASS_PREFIX	|
|	TT	|
|	TT_stack	|
|	UI_BACKGROUND_COVERAGE_DELAY	|
|	algorithm	|
|	all_goals_file	|
|	alternative_fitness_calculation_mode	|
|	analysis_criteria	|
|	array_limit	|
|	assertion_minimization_fallback	|
|	assertion_minimization_fallback_time	|
|	assertion_strategy	|
|	assertion_timeout	|
|	assertions	|
|	bloat_factor	|
|	branch_comparison_types	|
|	branch_eval	|
|	branch_statement	|
|	break_on_exception	|
|	call_probability	|
|	carve_object_pool	|
|	carving_timeout	|
|	catch_undeclared_exceptions	|
|	check_best_length	|
|	check_contracts	|
|	check_contracts_end	|
|	check_max_length	|
|	check_parents_length	|
|	chop_carved_exceptions	|
|	chop_max_length	|
|	chromosome_length	|
|	classpath	|
|	client_on_thread	|
|	cluster_recursion	|
|	concolic_mutation	|
|	concolic_timeout	|
|	configuration_id	|
|	connection_data	|
|	consider_main_methods	|
|	constraint_solution_attempts	|
|	coverage	|
|	coverage_matrix	|
|	coverage_matrix_filename	|
|	covered_goals_file	|
|	cpu_timeout	|
|	criterion	|
|	crossover_function	|
|	crossover_rate	|
|	ctg_bests_folder	|
|	ctg_cores	|
|	ctg_debug_port	|
|	ctg_delete_old_tmp_folders	|
|	ctg_dir	|
|	ctg_export_folder	|
|	ctg_extra_args	|
|	ctg_generation_dir_prefix	|
|	ctg_history_file	|
|	ctg_memory	|
|	ctg_min_time_per_job	|
|	ctg_project_info	|
|	ctg_schedule	|
|	ctg_seeds_dir_name	|
|	ctg_seeds_ext	|
|	ctg_seeds_file_in	|
|	ctg_seeds_file_out	|
|	ctg_selected_cuts	|
|	ctg_selected_cuts_file_location	|
|	ctg_time	|
|	ctg_time_per_class	|
|	ctg_tmp_logs_dir_name	|
|	ctg_tmp_pools_dir_name	|
|	ctg_tmp_reports_dir_name	|
|	ctg_tmp_tests_dir_name	|
|	cvc4_path	|
|	debug	|
|	defuse_aliases	|
|	defuse_debug_mode	|
|	double_precision	|
|	dse_constant_probability	|
|	dse_constraint_length	|
|	dse_constraint_solver_timeout_millis	|
|	dse_keep_all_tests	|
|	dse_negate_all_conditions	|
|	dse_probability	|
|	dse_rank_branch_conditions	|
|	dse_solver	|
|	dse_variable_resets	|
|	dynamic_limit	|
|	dynamic_pool	|
|	dynamic_pool_size	|
|	dynamic_seeding	|
|	eclipse_plugin	|
|	elite	|
|	enable_alternative_fitness_calculation	|
|	enable_alternative_suite_fitness	|
|	enable_asserts_for_evosuite	|
|	enable_asserts_for_sut	|
|	enable_secondary_objective_after	|
|	enable_secondary_starvation	|
|	epsilon	|
|	epson	|
|	error_branches	|
|	evosuite_use_uispec	|
|	exception_branches	|
|	exclude_ibranches_cut	|
|	extra_timeout	|
|	filter_assertions	|
|	filter_sandbox_tests	|
|	float_precision	|
|	functional_mocking_input_limit	|
|	functional_mocking_percent	|
|	global_timeout	|
|	group_id	|
|	handle_servlets	|
|	handle_static_fields	|
|	headless_chicken_test	|
|	headless_mode	|
|	hierarchy_data	|
|	ignore_missing_statistics	|
|	ignore_threads	|
|	inheritance_file	|
|	initialization_timeout	|
|	inline	|
|	insertion_score_object	|
|	insertion_score_parameter	|
|	insertion_score_uut	|
|	insertion_uut	|
|	insertion_uut	|
|	insertion_uut	|
|	instrument_context	|
|	instrument_libraries	|
|	instrument_method_calls	|
|	instrument_parent	|
|	instrumentation_skip_debug	|
|	is_running_a_system_test	|
|	jee	|
|	jmc	|
|	junit	|
|	junit_check	|
|	junit_check_on_separate_process	|
|	junit_check_timeout	|
|	junit_extend	|
|	junit_failed_suffix	|
|	junit_strict	|
|	junit_suffix	|
|	junit_tests	|
|	junit_theories	|
|	keep_regression_archive	|
|	kincompensation	|
|	lm_iterations	|
|	lm_mutation_type	|
|	lm_src	|
|	lm_strings	|
|	local_search_adaptation_rate	|
|	local_search_arrays	|
|	local_search_budget	|
|	local_search_budget_type	|
|	local_search_dse	|
|	local_search_ensure_double_execution	|
|	local_search_expand_tests	|
|	local_search_primitives	|
|	local_search_probability	|
|	local_search_probes	|
|	local_search_rate	|
|	local_search_references	|
|	local_search_restore_coverage	|
|	local_search_selective	|
|	local_search_selective_primitives	|
|	local_search_strings	|
|	log.level	|
|	log.target	|
|	log_goals	|
|	log_timeout	|
|	make_accessible	|
|	max_array	|
|	max_attempts	|
|	max_coverage_depth	|
|	max_delta	|
|	max_generic_depth	|
|	max_initial_tests	|
|	max_int	|
|	max_length	|
|	max_length_test_case	|
|	max_loop_iterations	|
|	max_mutants	|
|	max_mutants_per_class	|
|	max_mutants_per_method	|
|	max_mutants_per_test	|
|	max_recursion	|
|	max_replace_mutants	|
|	max_size	|
|	max_stalled_threads	|
|	max_started_threads	|
|	max_string	|
|	min_free_mem	|
|	min_initial_tests	|
|	minimization_timeout	|
|	minimize	|
|	minimize_old	|
|	minimize_second_pass	|
|	minimize_skip_coincidental	|
|	minimize_sort	|
|	minimize_strings	|
|	minimize_values	|
|	mock_if_no_generator	|
|	mutation_generations	|
|	mutation_rate	|
|	mutation_timeouts	|
|	new_object_selection	|
|	new_statistics	|
|	no_runtime_dependency	|
|	null_probability	|
|	num_random_tests	|
|	num_tests	|
|	number_of_mutations	|
|	object_pools	|
|	object_reuse_probability	|
|	output_granularity	|
|	output_variables	|
|	p_change_parameter	|
|	p_functional_mocking	|
|	p_object_pool	|
|	p_reflection_on_private	|
|	p_special_type_call	|
|	p_statement_insertion	|
|	p_test_change	|
|	p_test_delete	|
|	p_test_insert	|
|	p_test_insertion	|
|	parent_check	|
|	plot	|
|	population	|
|	population_limit	|
|	port	|
|	primitive_pool	|
|	primitive_reuse_probability	|
|	print_covered_goals	|
|	print_current_goals	|
|	print_goals	|
|	print_missed_goals	|
|	print_to_system	|
|	process_communication_port	|
|	profile	|
|	pure_equals	|
|	pure_inspectors	|
|	random_perturbation	|
|	random_seed	|
|	random_tests	|
|	randomize_difficulty	|
|	rank_bias	|
|	ranking_type	|
|	recycle_chromosomes	|
|	reflection_start_percent	|
|	regression_analysis_branchdistance	|
|	regression_analysis_combinations	|
|	regression_analysis_objectdistance	|
|	regression_analyze	|
|	regression_branch_distance	|
|	regression_different_branches	|
|	regression_disable_special_assertions	|
|	regression_diversity	|
|	regression_fitness	|
|	regression_random_strategy	|
|	regression_skip_different_cfg	|
|	regression_skip_similar	|
|	regression_statistics	|
|	regressioncp	|
|	remote_testing	|
|	replace_calls	|
|	replace_gui	|
|	replace_system_in	|
|	replacement_function	|
|	report_dir	|
|	reset_all_classes_during_assertion_generation	|
|	reset_all_classes_during_test_generation	|
|	reset_standard_streams	|
|	reset_static_field_gets	|
|	reset_static_fields	|
|	reset_static_final_fields	|
|	restrict_pool	|
|	reuse_budget	|
|	reuse_leftover_time	|
|	sandbox	|
|	sandbox_mode	|
|	save_all_data	|
|	scaffolding_suffix	|
|	search_budget	|
|	secondary_objectives	|
|	seed_clone	|
|	seed_dir	|
|	seed_file	|
|	seed_mutations	|
|	seed_probability	|
|	seed_types	|
|	selected_junit	|
|	selection_function	|
|	serialize_ga	|
|	serialize_regression_test_suite	|
|	serialize_result	|
|	show_progress	|
|	shuffle_goals	|
|	shutdown_hook	|
|	shutdown_timeout	|
|	skip_covered	|
|	sort_calls	|
|	sort_objects	|
|	sourcepath	|
|	spawn_process_manager_port	|
|	starvation_after_generation	|
|	starve_by_fitness	|
|	statistics_backend	|
|	stop_zero	|
|	stopping_condition	|
|	stopping_port	|
|	strategy	|
|	string_length	|
|	string_replacement	|
|	target_method	|
|	target_method_list	|
|	target_method_prefix	|
|	test_archive	|
|	test_carving	|
|	test_comments	|
|	test_dir	|
|	test_excludes	|
|	test_factory	|
|	test_format	|
|	test_includes	|
|	test_naming_strategy	|
|	test_scaffolding	|
|	testability_transformation	|
|	timeline_interpolation	|
|	timeline_interval	|
|	timeout	|
|	timeout_reset	|
|	tools_jar_location	|
|	tournament_size	|
|	track_boolean_branches	|
|	track_covered_gradient_branches	|
|	track_diversity	|
|	tt_scope	|
|	usage_models	|
|	usage_rate	|
|	use_deprecated	|
|	use_existing_coverage	|
|	use_separate_classloader	|
|	validate_runtime_variables	|
|	variable_pool	|
|	virtual_fs	|
|	virtual_net	|
|	write_all_goals_file	|
|	write_cfg	|
|	write_covered_goals_file	|
|	write_individuals	|
|	write_junit_timeout	|
|	write_pool	|
|	z3_path	|
|	z3_str2_path	|
