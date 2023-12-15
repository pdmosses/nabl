---
title: Schema.sdf3
hide:
  - toc
---

# `Schema.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/Schema.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/Schema.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/Schema.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/lang/Schema_1_8" title="Not referenced">statix/lang/Schema</span>

<span class="keyword">imports</span>
  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_4_3" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_5_3" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

<span class="keyword">context-free start-symbols</span>

  <a href="#Schema_13_3" id="Schema_9_3" title="Defined at line 13, 17">Schema</a>

<span class="keyword">context-free sorts</span>

  <a href="#Schema_9_3" id="Schema_13_3" title="Referenced at line 9">Schema</a>

<span class="keyword">context-free syntax</span>

  <a href="#Schema_9_3" id="Schema_17_3" title="Referenced at line 9">Schema</a>.<span class="cons_Constructor"><span id="SGSchema_17_10" title="Not referenced">SGSchema</span></span> = &lt;<span class="cons_String">scope</span> <span class="cons_String">graph</span> <span class="cons_String">scheme</span>
    &lt;<a href="#SGEdges_26_3" id="SGEdges_18_6" title="Defined at line 26, 31">SGEdges</a>&gt;

    &lt;<a href="#SGDecls_39_3" id="SGDecls_20_6" title="Defined at line 39, 45">SGDecls</a>&gt;

    &lt;<a href="#SchemaVars_56_3" id="SchemaVars_22_6" title="Defined at line 56, 61">SchemaVars</a>&gt;
  &gt;

<span class="keyword">context-free sorts</span>
  <a href="#SGEdges_18_6" id="SGEdges_26_3" title="Referenced at line 18">SGEdges</a>
  <a href="#SGEdge_32_7" id="SGEdge_27_3" title="Referenced at line 32">SGEdge</a>

<span class="keyword">context-free syntax</span>

  <a href="#SGEdges_18_6" id="SGEdges_31_3" title="Referenced at line 18">SGEdges</a>.<span class="cons_Constructor"><span id="SGEdges_31_11" title="Not referenced">SGEdges</span></span> = &lt;<span class="cons_String">edges</span>
    &lt;{<a href="#SGEdge_27_3" id="SGEdge_32_7" title="Defined at line 27, 35">SGEdge</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;

  <a href="#SGEdge_32_7" id="SGEdge_35_3" title="Referenced at line 32">SGEdge</a>.<span class="cons_Constructor"><span id="SGEdge_35_10" title="Not referenced">SGEdge</span></span> = [<span class="cons_String">{</span>[{<a href="#ScopeKindWithCard_71_3" id="ScopeKindWithCard_35_23" title="Defined at line 71, 84">ScopeKindWithCard</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">}</span> <span class="cons_String">=</span>[<a href="../Core.sdf3/#Label_196_3" id="Label_35_52" title="Defined at ../Core.sdf3 line 196">Label</a>]<span class="cons_String">=&gt;</span> <span class="cons_String">{</span>[{<a href="#ScopeKindWithCard_71_3" id="ScopeKindWithCard_35_64" title="Defined at line 71, 84">ScopeKindWithCard</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">}</span> <span class="cons_String">in</span> [<a href="../Core.sdf3/#RuleName_71_3" id="RuleName_35_95" title="Defined at ../Core.sdf3 line 71, 72">RuleName</a>]]

<span class="keyword">context-free sorts</span>

  <a href="#SGDecls_20_6" id="SGDecls_39_3" title="Referenced at line 20">SGDecls</a>
  <a href="#SGDecl_46_7" id="SGDecl_40_3" title="Referenced at line 46">SGDecl</a>
  <a href="#Data_49_66" id="Data_41_3" title="Referenced at line 49">Data</a>

<span class="keyword">context-free syntax</span>

  <a href="#SGDecls_20_6" id="SGDecls_45_3" title="Referenced at line 20">SGDecls</a>.<span class="cons_Constructor"><span id="SGDecls_45_11" title="Not referenced">SGDecls</span></span> = &lt;<span class="cons_String">decls</span>
    &lt;{<a href="#SGDecl_40_3" id="SGDecl_46_7" title="Defined at line 40, 49">SGDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;

  <a href="#SGDecl_46_7" id="SGDecl_49_3" title="Referenced at line 46">SGDecl</a>.<span class="cons_Constructor"><span id="SGDecl_49_10" title="Not referenced">SGDecl</span></span> = [<span class="cons_String">{</span>[{<a href="#ScopeKindWithCard_71_3" id="ScopeKindWithCard_49_23" title="Defined at line 71, 84">ScopeKindWithCard</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">}</span> <span class="cons_String">|=</span>[<a href="../Core.sdf3/#Label_196_3" id="Label_49_53" title="Defined at ../Core.sdf3 line 196">Label</a>]<span class="cons_String">=&gt;</span> \[[{<a href="#Data_41_3" id="Data_49_66" title="Defined at line 41, 51, 52">Data</a> <span class="cons_Lit">", "</span>}*]\] <span class="cons_String">in</span> [<a href="../Core.sdf3/#RuleName_71_3" id="RuleName_49_85" title="Defined at ../Core.sdf3 line 71, 72">RuleName</a>]]

  <a href="#Data_49_66" id="Data_51_3" title="Referenced at line 49">Data</a>.<span class="cons_Constructor"><span id="DData_51_8" title="Not referenced">DData</span></span>  = &lt;<span class="cons_String">data</span>&gt;
  <a href="#Data_49_66" id="Data_52_3" title="Referenced at line 49">Data</a>.<span class="cons_Constructor"><span id="DScope_52_8" title="Not referenced">DScope</span></span> = [<span class="cons_String">scope</span> <span class="cons_String">{</span>[{<a href="#ScopeKindWithCard_71_3" id="ScopeKindWithCard_52_27" title="Defined at line 71, 84">ScopeKindWithCard</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">}</span>]

<span class="keyword">context-free sorts</span>

  <a href="#SchemaVars_22_6" id="SchemaVars_56_3" title="Referenced at line 22">SchemaVars</a>
  <a href="#SchemaVar_62_7" id="SchemaVar_57_3" title="Referenced at line 62">SchemaVar</a>

<span class="keyword">context-free syntax</span>

  <a href="#SchemaVars_22_6" id="SchemaVars_61_3" title="Referenced at line 22">SchemaVars</a>.<span class="cons_Constructor"><span id="SchemaVars_61_14" title="Not referenced">SchemaVars</span></span> = &lt;<span class="cons_String">schema</span> <span class="cons_String">variables</span>
    &lt;{<a href="#SchemaVar_57_3" id="SchemaVar_62_7" title="Defined at line 57, 65">SchemaVar</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;

  <a href="#SchemaVar_62_7" id="SchemaVar_65_3" title="Referenced at line 62">SchemaVar</a>.<span class="cons_Constructor"><span id="SchemaVar_65_13" title="Not referenced">SchemaVar</span></span> = [[<a href="#ScopeKindVar_70_3" id="ScopeKindVar_65_27" title="Defined at line 70, 79, 80, 81, 82">ScopeKindVar</a>] <span class="cons_String">|-&gt;</span> <span class="cons_String">{</span>[{<a href="#ScopeKindWithCard_71_3" id="ScopeKindWithCard_65_48" title="Defined at line 71, 84">ScopeKindWithCard</a> <span class="cons_Lit">","</span>}*]<span class="cons_String">}</span>]

<span class="keyword">context-free sorts</span>

  <a href="#ScopeKind_84_43" id="ScopeKind_69_3" title="Referenced at line 84">ScopeKind</a>
  <a href="#ScopeKindVar_65_27" id="ScopeKindVar_70_3" title="Referenced at line 65">ScopeKindVar</a>
  <a href="#ScopeKindWithCard_35_23" id="ScopeKindWithCard_71_3" title="Referenced at line 35, 49, 52, 65">ScopeKindWithCard</a>

<span class="keyword">context-free syntax</span>

  <a href="#ScopeKind_84_43" id="ScopeKind_75_3" title="Referenced at line 84">ScopeKind</a>.<span class="cons_Constructor"><span id="Glob_75_13" title="Not referenced">Glob</span></span>         = &lt;<span class="cons_String">glob</span>&gt;
  <a href="#ScopeKind_84_43" id="ScopeKind_76_3" title="Referenced at line 84">ScopeKind</a>.<span class="cons_Constructor"><span id="KVar_76_13" title="Not referenced">KVar</span></span>         = &lt;<span class="cons_String">var</span> &lt;<a href="../Core.sdf3/#Var_337_3" id="Var_76_34" title="Defined at ../Core.sdf3 line 337, 338">Var</a>&gt;&gt;
  <a href="#ScopeKind_84_43" id="ScopeKind_77_3" title="Referenced at line 84">ScopeKind</a>.<span class="cons_Constructor"><span id="Unknown_77_13" title="Not referenced">Unknown</span></span>      = &lt;<span class="cons_String">unknown</span>&gt;

  <a href="#ScopeKindVar_65_27" id="ScopeKindVar_79_3" title="Referenced at line 65">ScopeKindVar</a>.<span class="cons_Constructor"><span id="Variable_79_16" title="Not referenced">Variable</span></span>  = &lt;<span class="cons_String">var</span> &lt;<a href="../Core.sdf3/#Var_337_3" id="Var_79_34" title="Defined at ../Core.sdf3 line 337, 338">Var</a>&gt;&gt;
  <a href="#ScopeKindVar_65_27" id="ScopeKindVar_80_3" title="Referenced at line 65">ScopeKindVar</a>.<span class="cons_Constructor"><span id="PArg_80_16" title="Not referenced">PArg</span></span>      = &lt;<span class="cons_String">prd</span> &lt;<a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_80_34" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>&gt;<span class="cons_String">[</span>&lt;<a href="#INTT_98_3" id="INTT_80_49" title="Defined at line 98">INTT</a>&gt;<span class="cons_String">]</span>&gt;
  <a href="#ScopeKindVar_65_27" id="ScopeKindVar_81_3" title="Referenced at line 65">ScopeKindVar</a>.<span class="cons_Constructor"><span id="CArg_81_16" title="Not referenced">CArg</span></span>      = &lt;<span class="cons_String">ctr</span> &lt;<a href="../Core.sdf3/#SortId_321_3" id="SortId_81_34" title="Defined at ../Core.sdf3 line 321, 322, 323">SortId</a>&gt;<span class="cons_String">[</span>&lt;<a href="#INTT_98_3" id="INTT_81_43" title="Defined at line 98">INTT</a>&gt;<span class="cons_String">]</span>&gt;
  <a href="#ScopeKindVar_65_27" id="ScopeKindVar_82_3" title="Referenced at line 65">ScopeKindVar</a>.<span class="cons_Constructor"><span id="RArg_82_16" title="Not referenced">RArg</span></span>      = &lt;<span class="cons_String">rel</span> &lt;<a href="../Core.sdf3/#Label_196_3" id="Label_82_34" title="Defined at ../Core.sdf3 line 196">Label</a>&gt;<span class="cons_String">[</span>&lt;<a href="#INTT_98_3" id="INTT_82_42" title="Defined at line 98">INTT</a>&gt;<span class="cons_String">]</span>&gt;

  <a href="#ScopeKindWithCard_35_23" id="ScopeKindWithCard_84_3" title="Referenced at line 35, 49, 52, 65">ScopeKindWithCard</a>.<span class="cons_Constructor"><span id="ScopeKindWithCard_84_21" title="Not referenced">ScopeKindWithCard</span></span> = &lt;&lt;<a href="#ScopeKind_69_3" id="ScopeKind_84_43" title="Defined at line 69, 75, 76, 77">ScopeKind</a>&gt;<span class="cons_String">[</span>&lt;<a href="#Cardinality_88_3" id="Cardinality_84_55" title="Defined at line 88, 93">Cardinality</a>&gt;<span class="cons_String">]</span>&gt;

<span class="keyword">context-free sorts</span>

  <a href="#Cardinality_84_55" id="Cardinality_88_3" title="Referenced at line 84">Cardinality</a>
  <a href="#Bound_93_31" id="Bound_89_3" title="Referenced at line 93">Bound</a>

<span class="keyword">context-free syntax</span>

  <a href="#Cardinality_84_55" id="Cardinality_93_3" title="Referenced at line 84">Cardinality</a>.<span class="cons_Constructor"><span id="Cardinality_93_15" title="Not referenced">Cardinality</span></span> = &lt;&lt;<a href="#Bound_89_3" id="Bound_93_31" title="Defined at line 89, 94, 95">Bound</a>&gt;<span class="cons_String">..</span>&lt;<a href="#Bound_89_3" id="Bound_93_40" title="Defined at line 89, 94, 95">Bound</a>&gt;&gt;
  <a href="#Bound_93_31" id="Bound_94_3" title="Referenced at line 93">Bound</a>.<span class="cons_Constructor"><span id="INF_94_9" title="Not referenced">INF</span></span>               = &lt;<span class="cons_String">*</span>&gt;
  <a href="#Bound_93_31" id="Bound_95_3" title="Referenced at line 93">Bound</a>.<span class="cons_Constructor"><span id="BNum_95_9" title="Not referenced">BNum</span></span>              = &lt;&lt;<a href="#INTT_98_3" id="INTT_95_31" title="Defined at line 98">INTT</a>&gt;&gt;

<span class="keyword">lexical sorts</span>
  <a href="#INTT_80_49" id="INTT_98_3" title="Referenced at line 80, 81, 82, 95">INTT</a>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
