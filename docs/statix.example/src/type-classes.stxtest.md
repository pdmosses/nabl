---
title: type-classes.stxtest
hide:
  - toc
---

# `type-classes.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/type-classes.stxtest]

[pdmosses/nabl/statix.example/src/type-classes.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/type-classes.stxtest "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
</pre></div></td>
<td class="code"><pre><code><span class="layout">/** Type-classes a la Haskell
                      * Goal:
                      * Limitations:
                      * - No support for non-linear patterns
                      * Result:
                      */</span>
<span class="keyword">resolve</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_32_7" id="s_7_10" title="Referenced at line 32, 33, 34"><span class="token sort_Id">s</span></a></span> <span class="cons_Var"><a href="#m_9_3" id="m_7_12" title="Referenced at line 9, 33"><span class="token sort_Id">m</span></a></span><span class="operator">}</span>

  <span class="cons_Var"><a href="#m_7_12" id="m_9_3" title="Defined at line 7"><span class="token sort_Id">m</span></a></span> <span class="operator">==</span> <span class="cons_Op"><a href="#Module_41_5" id="Module_9_8" title="Defined at line 41"><span class="token sort_Id">Module</span></a><span class="operator">([</span>

<span class="layout">//  class () =&gt; Eq a where</span>
<span class="layout">//    eq :: a -&gt; a -&gt; Bool   -- eq :: Eq a =&gt; a -&gt; a -&gt; Bool</span>
    <span class="cons_Op"><a href="#ClassDef_44_5" id="ClassDef_13_5" title="Defined at line 44"><span class="token sort_Id">ClassDef</span></a><span class="operator">([],</span> <span class="cons_Str"><span class="operator">"</span>Eq"</span><span class="operator">,</span> <span class="cons_Op"><a href="#TVar_50_5" id="TVar_13_24" title="Defined at line 50"><span class="token sort_Id">TVar</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>a"</span>)</span><span class="operator">,</span> <span class="operator">[</span>
      <span class="cons_Op"><a href="#Fun_53_5" id="Fun_14_7" title="Defined at line 53"><span class="token sort_Id">Fun</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>eq"</span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Op"><a href="#TVar_50_5" id="TVar_14_18" title="Defined at line 50"><span class="token sort_Id">TVar</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>a"</span>)</span><span class="operator">,</span> <span class="cons_Op"><a href="#TVar_50_5" id="TVar_14_29" title="Defined at line 50"><span class="token sort_Id">TVar</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>a"</span>)</span><span class="operator">],</span> <span class="cons_Op"><a href="#Bool_48_5" id="Bool_14_41" title="Defined at line 48"><span class="token sort_Id">Bool</span></a>()</span>, [])</span>
    ])</span>

<span class="layout">//  instance () =&gt; Eq Bool where</span>
<span class="layout">//    eq True True = True </span>
<span class="layout">//    eq False False = True </span>
  <span class="operator">,</span> <span class="cons_Op"><a href="#InstanceDef_45_5" id="InstanceDef_20_5" title="Defined at line 45"><span class="token sort_Id">InstanceDef</span></a><span class="operator">([],</span> <span class="cons_Str"><span class="operator">"</span>Eq"</span><span class="operator">,</span> <span class="cons_Op"><a href="#Bool_48_5" id="Bool_20_27" title="Defined at line 48"><span class="token sort_Id">Bool</span></a>()</span><span class="operator">,</span> <span class="operator">[</span>
      <span class="cons_Op"><a href="#Fun_53_5" id="Fun_21_7" title="Defined at line 53"><span class="token sort_Id">Fun</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>eq"</span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Op"><a href="#Bool_48_5" id="Bool_21_18" title="Defined at line 48"><span class="token sort_Id">Bool</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#Bool_48_5" id="Bool_21_26" title="Defined at line 48"><span class="token sort_Id">Bool</span></a>()</span><span class="operator">],</span> <span class="cons_Op"><a href="#Bool_48_5" id="Bool_21_35" title="Defined at line 48"><span class="token sort_Id">Bool</span></a>()</span><span class="operator">,</span> <span class="operator">[</span>
        <span class="cons_Op"><a href="#Case_56_5" id="Case_22_9" title="Defined at line 56"><span class="token sort_Id">Case</span></a><span class="operator">([</span><span class="cons_Op"><a href="#True_63_5" id="True_22_15" title="Defined at line 63"><span class="token sort_Id">True</span></a>()</span> <span class="operator">,</span> <span class="cons_Op"><a href="#True_63_5" id="True_22_24" title="Defined at line 63"><span class="token sort_Id">True</span></a>()</span> <span class="operator">],</span> <span class="cons_Op"><a href="#Term_60_5" id="Term_22_34" title="Defined at line 60"><span class="token sort_Id">Term</span></a><span class="operator">(</span><span class="cons_Op"><a href="#True_63_5" id="True_22_39" title="Defined at line 63"><span class="token sort_Id">True</span></a>()</span>)</span>)</span>
      <span class="operator">,</span> <span class="cons_Op"><a href="#Case_56_5" id="Case_23_9" title="Defined at line 56"><span class="token sort_Id">Case</span></a><span class="operator">([</span><span class="cons_Op"><a href="#False_64_5" id="False_23_15" title="Defined at line 64"><span class="token sort_Id">False</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#False_64_5" id="False_23_24" title="Defined at line 64"><span class="token sort_Id">False</span></a>()</span><span class="operator">],</span> <span class="cons_Op"><a href="#Term_60_5" id="Term_23_34" title="Defined at line 60"><span class="token sort_Id">Term</span></a><span class="operator">(</span><span class="cons_Op"><a href="#True_63_5" id="True_23_39" title="Defined at line 63"><span class="token sort_Id">True</span></a>()</span>)</span>)</span>
      ])</span>
    ])</span>

// instance Eq a =&gt; Eq (a * a) where
//  (x1, x2) == (y1, y2) = x1 == y1 &amp;&amp; x2 == y2

  ])</span><span class="operator">,</span>

  <span class="keyword">new</span> <span class="cons_Var"><a href="#s_7_10" id="s_32_7" title="Defined at line 7"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
  <a href="#moduleOk_93_3" id="moduleOk_33_3" title="Defined at line 93"><span class="token sort_Id">moduleOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_7_10" id="s_33_12" title="Defined at line 7"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#m_7_12" id="m_33_15" title="Defined at line 7"><span class="token sort_Id">m</span></a></span><span class="operator">),</span>
  <a href="#instanceOf_125_3" id="instanceOf_34_3" title="Defined at line 125"><span class="token sort_Id">instanceOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_7_10" id="s_34_14" title="Defined at line 7"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Str"><span class="operator">"</span>Eq"</span><span class="operator">,</span> <span class="cons_Op"><a href="#Bool_48_5" id="Bool_34_23" title="Defined at line 48"><span class="token sort_Id">Bool</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="#ID_44_30" id="ID_38_9" title="Referenced at line 44, 45, 50, 53, 59, 65, 74, 77, 78, 79"><span class="token sort_Id">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Module_41_27" id="Module_40_9" title="Referenced at line 41, 93"><span class="token sort_Id">Module</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Module_9_8" id="Module_41_5" title="Referenced at line 9, 95"><span class="token sort_Id">Module</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Def_43_9" id="Def_41_19" title="Defined at line 43"><span class="token sort_Id">Def</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Module_40_9" id="Module_41_27" title="Defined at line 40"><span class="token sort_Id">Module</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Def_41_19" id="Def_43_9" title="Referenced at line 41, 44, 45, 102"><span class="token sort_Id">Def</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#ClassDef_13_5" id="ClassDef_44_5" title="Referenced at line 13, 104"><span class="token sort_Id">ClassDef</span></a>    <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TC_73_9" id="TC_44_24" title="Defined at line 73"><span class="token sort_Id">TC</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_44_30" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_44_35" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#FunDef_52_9" id="FunDef_44_47" title="Defined at line 52"><span class="token sort_Id">FunDef</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Def_43_9" id="Def_44_58" title="Defined at line 43"><span class="token sort_Id">Def</span></a></span></span>
    <span class="cons_OpDecl"><a href="#InstanceDef_20_5" id="InstanceDef_45_5" title="Referenced at line 20, 109"><span class="token sort_Id">InstanceDef</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TC_73_9" id="TC_45_24" title="Defined at line 73"><span class="token sort_Id">TC</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_45_30" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_45_35" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#FunDef_52_9" id="FunDef_45_47" title="Defined at line 52"><span class="token sort_Id">FunDef</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Def_43_9" id="Def_45_58" title="Defined at line 43"><span class="token sort_Id">Def</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Type_44_35" id="Type_47_9" title="Referenced at line 44, 45, 48, 49, 50, 53, 70, 71, 74, 89, 116, 119, 125, 136, 140"><span class="token sort_Id">Type</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Bool_14_41" id="Bool_48_5" title="Referenced at line 14, 20, 21, 34, 145"><span class="token sort_Id">Bool</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_48_12" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span></span>
    <span class="cons_OpDecl"><span id="Int_49_5" title="Not referenced"><span class="token sort_Id">Int</span></span>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_49_12" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span></span>
    <span class="cons_OpDecl"><a href="#TVar_13_24" id="TVar_50_5" title="Referenced at line 13, 14, 117, 120, 142"><span class="token sort_Id">TVar</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_50_12" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_50_18" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#FunDef_44_47" id="FunDef_52_9" title="Referenced at line 44, 45, 53"><span class="token sort_Id">FunDef</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Fun_14_7" id="Fun_53_5" title="Referenced at line 14, 21"><span class="token sort_Id">Fun</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_53_11" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_53_21" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_53_29" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#FunCase_55_9" id="FunCase_53_41" title="Defined at line 55"><span class="token sort_Id">FunCase</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#FunDef_52_9" id="FunDef_53_53" title="Defined at line 52"><span class="token sort_Id">FunDef</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#FunCase_53_41" id="FunCase_55_9" title="Referenced at line 53, 56"><span class="token sort_Id">FunCase</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Case_22_9" id="Case_56_5" title="Referenced at line 22, 23"><span class="token sort_Id">Case</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Term_62_9" id="Term_56_17" title="Defined at line 62"><span class="token sort_Id">Term</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_58_9" id="Exp_56_25" title="Defined at line 58"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#FunCase_55_9" id="FunCase_56_32" title="Defined at line 55"><span class="token sort_Id">FunCase</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Exp_56_25" id="Exp_58_9" title="Referenced at line 56, 59, 60"><span class="token sort_Id">Exp</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="App_59_5" title="Not referenced"><span class="token sort_Id">App</span></span>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_59_12" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Exp_58_9" id="Exp_59_22" title="Defined at line 58"><span class="token sort_Id">Exp</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_58_9" id="Exp_59_30" title="Defined at line 58"><span class="token sort_Id">Exp</span></a></span></span>
    <span class="cons_OpDecl"><a href="#Term_22_34" id="Term_60_5" title="Referenced at line 22, 23"><span class="token sort_Id">Term</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Term_62_9" id="Term_60_12" title="Defined at line 62"><span class="token sort_Id">Term</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_58_9" id="Exp_60_20" title="Defined at line 58"><span class="token sort_Id">Exp</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Term_56_17" id="Term_62_9" title="Referenced at line 56, 60, 63, 64, 65"><span class="token sort_Id">Term</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#True_22_15" id="True_63_5" title="Referenced at line 22, 23"><span class="token sort_Id">True</span></a>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Term_62_9" id="Term_63_13" title="Defined at line 62"><span class="token sort_Id">Term</span></a></span></span>
    <span class="cons_OpDecl"><a href="#False_23_15" id="False_64_5" title="Referenced at line 23"><span class="token sort_Id">False</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Term_62_9" id="Term_64_13" title="Defined at line 62"><span class="token sort_Id">Term</span></a></span></span>
    <span class="cons_OpDecl"><span id="Var_65_5" title="Not referenced"><span class="token sort_Id">Var</span></span>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_65_13" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Term_62_9" id="Term_65_19" title="Defined at line 62"><span class="token sort_Id">Term</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#TYPE_70_29" id="TYPE_69_9" title="Referenced at line 70, 71, 88"><span class="token sort_Id">TYPE</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#CLASS_107_31" id="CLASS_70_5" title="Referenced at line 107, 112, 130, 132"><span class="token sort_Id">CLASS</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_70_13" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_69_9" id="TYPE_70_29" title="Defined at line 69"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><span id="FUN_71_5" title="Not referenced"><span class="token sort_Id">FUN</span></span>   <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TC_73_9" id="TC_71_18" title="Defined at line 73"><span class="token sort_Id">TC</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_71_29" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_71_37" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_69_9" id="TYPE_71_45" title="Defined at line 69"><span class="token sort_Id">TYPE</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#TC_44_24" id="TC_73_9" title="Referenced at line 44, 45, 71, 74"><span class="token sort_Id">TC</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="TC_74_5" title="Not referenced"><span class="token sort_Id">TC</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_74_10" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_74_15" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TC_73_9" id="TC_74_23" title="Defined at line 73"><span class="token sort_Id">TC</span></a></span></span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><a href="#Class_83_13" id="Class_77_5" title="Referenced at line 83, 107"><span class="token sort_Id">Class</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_77_16" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span></span>
    <span class="cons_NsDecl"><a href="#Instance_84_13" id="Instance_78_5" title="Referenced at line 84, 112, 130"><span class="token sort_Id">Instance</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_78_16" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span></span>
    <span class="cons_NsDecl"><a href="#Fun_85_13" id="Fun_79_5" title="Referenced at line 85"><span class="token sort_Id">Fun</span></a>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_38_9" id="ID_79_16" title="Defined at line 38"><span class="token sort_Id">ID</span></a></span></span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><a href="#P_83_26" id="P_82_12" title="Referenced at line 83, 84, 85, 129, 131"><span class="token sort_Id">P</span></a></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Class_77_5" id="Class_83_13" title="Defined at line 77"><span class="token sort_Id">Class</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_82_12" id="P_83_26" title="Defined at line 82"><span class="token sort_Id">P</span></a></span>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_82_12" id="P_83_37" title="Defined at line 82"><span class="token sort_Id">P</span></a></span></span></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Instance_78_5" id="Instance_84_13" title="Defined at line 78"><span class="token sort_Id">Instance</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_82_12" id="P_84_29" title="Defined at line 82"><span class="token sort_Id">P</span></a></span>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_82_12" id="P_84_40" title="Defined at line 82"><span class="token sort_Id">P</span></a></span></span></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Fun_79_5" id="Fun_85_13" title="Defined at line 79"><span class="token sort_Id">Fun</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_82_12" id="P_85_24" title="Defined at line 82"><span class="token sort_Id">P</span></a></span>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_82_12" id="P_85_35" title="Defined at line 82"><span class="token sort_Id">P</span></a></span></span></span>
    
  <span class="keyword">relations</span>
    <span class="cons_Label"><a href="#type_107_26" id="type_88_5" title="Referenced at line 107, 112, 128"><span class="token sort_Id">type</span></a></span>  <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_69_9" id="TYPE_88_26" title="Defined at line 69"><span class="token sort_Id">TYPE</span></a></span>
    <span class="cons_Label"><a href="#subst_143_6" id="subst_89_5" title="Referenced at line 143"><span class="token sort_Id">subst</span></a></span> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_89_23" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span>

<span class="keyword">rules</span>

  <a href="#moduleOk_33_3" id="moduleOk_93_3" title="Referenced at line 33, 95"><span class="token sort_Id">moduleOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Module_40_9" id="Module_93_22" title="Defined at line 40"><span class="token sort_Id">Module</span></a></span>

  <a href="#moduleOk_93_3" id="moduleOk_95_3" title="Defined at line 93"><span class="token sort_Id">moduleOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_96_12" id="s_95_12" title="Referenced at line 96"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Module_41_5" id="Module_95_15" title="Defined at line 41"><span class="token sort_Id">Module</span></a><span class="operator">(</span><span class="cons_Var"><a href="#defs_96_15" id="defs_95_22" title="Referenced at line 96"><span class="token sort_Id">defs</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span>
    <a href="#defsOk_100_3" id="defsOk_96_5" title="Defined at line 100"><span class="token sort_Id">defsOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_95_12" id="s_96_12" title="Defined at line 95"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#defs_95_22" id="defs_96_15" title="Defined at line 95"><span class="token sort_Id">defs</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#defsOk_96_5" id="defsOk_100_3" title="Referenced at line 96"><span class="token sort_Id">defsOk</span></a> <span class="keyword">maps</span> <a href="#defOk_102_3" id="defOk_100_15" title="Defined at line 102"><span class="token sort_Id">defOk</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

  <a href="#defOk_100_15" id="defOk_102_3" title="Referenced at line 100, 104, 109"><span class="token sort_Id">defOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Def_43_9" id="Def_102_19" title="Defined at line 43"><span class="token sort_Id">Def</span></a></span>    

  <a href="#defOk_102_3" id="defOk_104_3" title="Defined at line 102"><span class="token sort_Id">defOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_107_5" id="s_104_9" title="Referenced at line 107"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#ClassDef_44_5" id="ClassDef_104_12" title="Defined at line 44"><span class="token sort_Id">ClassDef</span></a><span class="operator">([],</span> <span class="cons_Var"><a href="#x_107_16" id="x_104_25" title="Referenced at line 107"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ty_105_13" id="ty_104_28" title="Referenced at line 105, 107"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><span id="funs_104_32" title="Not referenced"><span class="token sort_Id">funs</span></span></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_class_106_9" id="s_class_104_43" title="Referenced at line 106, 107"><span class="token sort_Id">s_class</span></a></span><span class="operator">}</span>
    <a href="#varType_116_3" id="varType_105_5" title="Defined at line 116"><span class="token sort_Id">varType</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_104_28" id="ty_105_13" title="Defined at line 104"><span class="token sort_Id">ty</span></a></span><span class="operator">),</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#s_class_104_43" id="s_class_106_9" title="Defined at line 104"><span class="token sort_Id">s_class</span></a></span><span class="operator">,</span>
    <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Class</span><span class="operator">{</span><span class="token sort_Id">x</span><span class="operator">@</span><span class="token sort_Id">x</span><span class="operator">}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#type_88_5" id="type_107_26" title="Defined at line 88"><span class="token sort_Id">type</span></a></span> <span class="cons_Op"><a href="#CLASS_70_5" id="CLASS_107_31" title="Defined at line 70"><span class="token sort_Id">CLASS</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_104_28" id="ty_107_37" title="Defined at line 104"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s_class_104_43" id="s_class_107_41" title="Defined at line 104"><span class="token sort_Id">s_class</span></a></span>)</span><span class="operator">.</span>

  <a href="#defOk_102_3" id="defOk_109_3" title="Defined at line 102"><span class="token sort_Id">defOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_112_5" id="s_109_9" title="Referenced at line 112"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#InstanceDef_45_5" id="InstanceDef_109_12" title="Defined at line 45"><span class="token sort_Id">InstanceDef</span></a><span class="operator">([],</span> <span class="cons_Var"><a href="#x_112_19" id="x_109_28" title="Referenced at line 112"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ty_110_20" id="ty_109_31" title="Referenced at line 110, 112"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><span id="funs_109_35" title="Not referenced"><span class="token sort_Id">funs</span></span></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_inst_111_9" id="s_inst_109_46" title="Referenced at line 111, 112"><span class="token sort_Id">s_inst</span></a></span><span class="operator">}</span>
    <a href="#headNormalType_119_3" id="headNormalType_110_5" title="Defined at line 119"><span class="token sort_Id">headNormalType</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_109_31" id="ty_110_20" title="Defined at line 109"><span class="token sort_Id">ty</span></a></span><span class="operator">),</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#s_inst_109_46" id="s_inst_111_9" title="Defined at line 109"><span class="token sort_Id">s_inst</span></a></span><span class="operator">,</span>
    <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Instance</span><span class="operator">{</span><span class="token sort_Id">x</span><span class="operator">@</span><span class="token sort_Id">x</span><span class="operator">}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#type_88_5" id="type_112_29" title="Defined at line 88"><span class="token sort_Id">type</span></a></span> <span class="cons_Op"><a href="#CLASS_70_5" id="CLASS_112_34" title="Defined at line 70"><span class="token sort_Id">CLASS</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_109_31" id="ty_112_40" title="Defined at line 109"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s_inst_109_46" id="s_inst_112_44" title="Defined at line 109"><span class="token sort_Id">s_inst</span></a></span>)</span><span class="operator">.</span>

<span class="keyword">rules</span>

  <a href="#varType_105_5" id="varType_116_3" title="Referenced at line 105, 117"><span class="token sort_Id">varType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_116_13" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span>
  <a href="#varType_116_3" id="varType_117_3" title="Defined at line 116"><span class="token sort_Id">varType</span></a><span class="operator">(</span><span class="cons_Op"><a href="#TVar_50_5" id="TVar_117_11" title="Defined at line 50"><span class="token sort_Id">TVar</span></a>(_)</span><span class="operator">).</span>

  <a href="#headNormalType_110_5" id="headNormalType_119_3" title="Referenced at line 110, 120, 121"><span class="token sort_Id">headNormalType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_119_20" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span>
  <a href="#headNormalType_119_3" id="headNormalType_120_3" title="Defined at line 119"><span class="token sort_Id">headNormalType</span></a><span class="operator">(</span><span class="cons_Op"><a href="#TVar_50_5" id="TVar_120_18" title="Defined at line 50"><span class="token sort_Id">TVar</span></a>(_)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="keyword">false</span><span class="operator">.</span>
  <a href="#headNormalType_119_3" id="headNormalType_121_3" title="Defined at line 119"><span class="token sort_Id">headNormalType</span></a><span class="operator">(_).</span>

<span class="keyword">rules</span>

  <a href="#instanceOf_34_3" id="instanceOf_125_3" title="Referenced at line 34, 127"><span class="token sort_Id">instanceOf</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_StringSort">string</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_125_33" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">-&gt;</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span><span class="operator">)</span>

  <a href="#instanceOf_125_3" id="instanceOf_127_3" title="Defined at line 125"><span class="token sort_Id">instanceOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_132_10" id="s_127_14" title="Referenced at line 132"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#x_130_60" id="x_127_17" title="Referenced at line 130"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ty_130_79" id="ty_127_20" title="Referenced at line 130"><span class="token sort_Id">ty</span></a></span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">(</span><span class="cons_Var"><a href="#d_132_22" id="d_127_27" title="Referenced at line 132"><span class="token sort_Id">d</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s_inst_132_40" id="s_inst_127_30" title="Referenced at line 132"><span class="token sort_Id">s_inst</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#ty_inst_132_31" id="ty_inst_127_42" title="Referenced at line 132"><span class="token sort_Id">ty_inst</span></a></span><span class="operator">}</span>
    <span class="keyword">query</span> <span class="cons_Label"><a href="#type_88_5" id="type_128_11" title="Defined at line 88"><span class="token sort_Id">type</span></a></span>
      <span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_82_12" id="P_129_14" title="Defined at line 82"><span class="token sort_Id">P</span></a></span>*</span>
          <span class="keyword">and</span> <span class="operator">{</span> <span class="operator">(</span><span class="cons_StxOccurrence"><a href="#Instance_78_5" id="Instance_130_18" title="Defined at line 78"><span class="token sort_Id">Instance</span></a><span class="operator">{</span><span class="cons_Var"><a href="#x_inst_130_65" id="x_inst_130_27" title="Referenced at line 130"><span class="token sort_Id">x_inst</span></a></span>@_}</span><span class="operator">,</span> <span class="cons_Op"><a href="#CLASS_70_5" id="CLASS_130_38" title="Defined at line 70"><span class="token sort_Id">CLASS</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_inst_130_83" id="ty_inst_130_44" title="Referenced at line 130"><span class="token sort_Id">ty_inst</span></a></span>, _)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="cons_Var"><a href="#x_127_17" id="x_130_60" title="Defined at line 127"><span class="token sort_Id">x</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#x_inst_130_27" id="x_inst_130_65" title="Defined at line 130"><span class="token sort_Id">x_inst</span></a></span><span class="operator">,</span> <a href="#match_136_3" id="match_130_73" title="Defined at line 136"><span class="token sort_Id">match</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_127_20" id="ty_130_79" title="Defined at line 127"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ty_inst_130_44" id="ty_inst_130_83" title="Defined at line 130"><span class="token sort_Id">ty_inst</span></a></span><span class="operator">)</span> <span class="operator">}</span>
      <span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_82_12" id="P_131_15" title="Defined at line 82"><span class="token sort_Id">P</span></a></span> <span class="keyword">and</span> <span class="keyword">true</span>
      <span class="keyword">in</span> <span class="cons_Var"><a href="#s_127_14" id="s_132_10" title="Defined at line 127"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(</span><span class="cons_Var"><a href="#d_127_27" id="d_132_22" title="Defined at line 127"><span class="token sort_Id">d</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#CLASS_70_5" id="CLASS_132_25" title="Defined at line 70"><span class="token sort_Id">CLASS</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_inst_127_42" id="ty_inst_132_31" title="Defined at line 127"><span class="token sort_Id">ty_inst</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s_inst_127_30" id="s_inst_132_40" title="Defined at line 127"><span class="token sort_Id">s_inst</span></a></span>)</span><span class="operator">))].</span>

<span class="keyword">rules</span>

  <a href="#match_130_73" id="match_136_3" title="Referenced at line 130, 138"><span class="token sort_Id">match</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_136_11" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_136_18" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span>

  <a href="#match_136_3" id="match_138_3" title="Defined at line 136"><span class="token sort_Id">match</span></a><span class="operator">(</span><span class="cons_Var"><a href="#P_138_31" id="P_138_9" title="Referenced at line 138"><span class="token sort_Id">P</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_138_34" id="T_138_12" title="Referenced at line 138"><span class="token sort_Id">T</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <a href="#matchIn_140_3" id="matchIn_138_18" title="Defined at line 140"><span class="token sort_Id">matchIn</span></a><span class="operator">(</span><span class="keyword">new</span><span class="operator">,</span> <span class="cons_Var"><a href="#P_138_9" id="P_138_31" title="Defined at line 138"><span class="token sort_Id">P</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_138_12" id="T_138_34" title="Defined at line 138"><span class="token sort_Id">T</span></a></span><span class="operator">).</span>
    
  <a href="#matchIn_138_18" id="matchIn_140_3" title="Referenced at line 138, 142, 145"><span class="token sort_Id">matchIn</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_140_21" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_47_9" id="Type_140_28" title="Defined at line 47"><span class="token sort_Id">Type</span></a></span>
  
  <a href="#matchIn_140_3" id="matchIn_142_3" title="Defined at line 140"><span class="token sort_Id">matchIn</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_143_21" id="s_142_11" title="Referenced at line 143"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#TVar_50_5" id="TVar_142_14" title="Defined at line 50"><span class="token sort_Id">TVar</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_143_12" id="x_142_19" title="Referenced at line 143"><span class="token sort_Id">x</span></a></span>)</span><span class="operator">,</span> <span class="cons_Var"><a href="#T_143_15" id="T_142_23" title="Referenced at line 143"><span class="token sort_Id">T</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="operator">!</span><span class="cons_Label"><a href="#subst_89_5" id="subst_143_6" title="Defined at line 89"><span class="token sort_Id">subst</span></a></span><span class="operator">[</span><span class="cons_Var"><a href="#x_142_19" id="x_143_12" title="Defined at line 142"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_142_23" id="T_143_15" title="Defined at line 142"><span class="token sort_Id">T</span></a></span><span class="operator">]</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_142_11" id="s_143_21" title="Defined at line 142"><span class="token sort_Id">s</span></a></span><span class="operator">.</span>

  <a href="#matchIn_140_3" id="matchIn_145_3" title="Defined at line 140"><span class="token sort_Id">matchIn</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_145_11" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="cons_Op"><a href="#Bool_48_5" id="Bool_145_14" title="Defined at line 48"><span class="token sort_Id">Bool</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#Bool_48_5" id="Bool_145_22" title="Defined at line 48"><span class="token sort_Id">Bool</span></a>()</span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
