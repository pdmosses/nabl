---
title: stlc.desugared.stx
hide:
  - toc
---

# `stlc.desugared.stx`

:simple-github: [pdmosses/nabl/statix.example/src/stlc.desugared.stx]

[pdmosses/nabl/statix.example/src/stlc.desugared.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/stlc.desugared.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="stlc.desugared_7_21" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">stlc</span><span class="operator">.</span><span class="token sort_ConstraintId">desugared</span></span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span>
    <a href="#ID_120_122" id="ID_46_48" title="Referenced at line 15, 17, 18"><span class="token sort_OpId">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#BinOp_149_154" id="BinOp_71_76" title="Referenced at line 16"><span class="token sort_OpId">BinOp</span></a></span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#Exp_126_129" id="Exp_90_93" title="Referenced at line 15, 16, 16, 16, 17, 17, 18, 19, 19, 19, 47"><span class="token sort_OpId">Exp</span></a></span>

  <span class="keyword">constructors</span>
    <a href="#Num_651_654" id="Num_114_117" title="Referenced at line 49"><span class="token sort_OpId">Num</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_46_48" id="ID_120_122" title="Defined at line 6"><span class="token sort_OpId">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_126_129" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span>
    <a href="#BinExp_699_705" id="BinExp_134_140" title="Referenced at line 52"><span class="token sort_OpId">BinExp</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_143_146" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BinOp_71_76" id="BinOp_149_154" title="Defined at line 9"><span class="token sort_OpId">BinOp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_157_160" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_164_167" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span>
    <a href="#Fun_816_819" id="Fun_172_175" title="Referenced at line 56"><span class="token sort_OpId">Fun</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_46_48" id="ID_178_180" title="Defined at line 6"><span class="token sort_OpId">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TypeExp_264_271" id="TypeExp_183_190" title="Defined at line 22"><span class="token sort_OpId">TypeExp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_193_196" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_200_203" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span>
    <a href="#Var_1066_1069" id="Var_208_211" title="Referenced at line 65"><span class="token sort_OpId">Var</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_46_48" id="ID_214_216" title="Defined at line 6"><span class="token sort_OpId">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_220_223" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span>
    <a href="#App_1286_1289" id="App_228_231" title="Referenced at line 72"><span class="token sort_OpId">App</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_234_237" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_240_243" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_247_250" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#TypeExp_183_190" id="TypeExp_264_271" title="Referenced at line 17, 25, 26, 26, 26, 80"><span class="token sort_OpId">TypeExp</span></a></span>

  <span class="keyword">constructors</span>
    <a href="#NumType_1485_1492" id="NumType_292_299" title="Referenced at line 82"><span class="token sort_OpId">NumType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TypeExp_264_271" id="TypeExp_302_309" title="Defined at line 22"><span class="token sort_OpId">TypeExp</span></a></span>
    <a href="#FunType_1539_1546" id="FunType_314_321" title="Referenced at line 85"><span class="token sort_OpId">FunType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TypeExp_264_271" id="TypeExp_324_331" title="Defined at line 22"><span class="token sort_OpId">TypeExp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TypeExp_264_271" id="TypeExp_334_341" title="Defined at line 22"><span class="token sort_OpId">TypeExp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TypeExp_264_271" id="TypeExp_345_352" title="Defined at line 22"><span class="token sort_OpId">TypeExp</span></a></span>

  <span class="keyword">sorts</span>
    <span class="cons_SortDecl"><a href="#Type_397_401" id="Type_366_370" title="Referenced at line 32, 33, 33, 33, 36, 47, 80"><span class="token sort_OpId">Type</span></a></span>

  <span class="keyword">constructors</span>
    <a href="#NUM_663_666" id="NUM_391_394" title="Referenced at line 49, 52, 53, 54, 82"><span class="token sort_OpId">NUM</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_366_370" id="Type_397_401" title="Defined at line 29"><span class="token sort_OpId">Type</span></a></span>
    <a href="#FUN_835_838" id="FUN_406_409" title="Referenced at line 56, 74, 85"><span class="token sort_OpId">FUN</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_366_370" id="Type_412_416" title="Defined at line 29"><span class="token sort_OpId">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_366_370" id="Type_419_423" title="Defined at line 29"><span class="token sort_OpId">Type</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_366_370" id="Type_427_431" title="Defined at line 29"><span class="token sort_OpId">Type</span></a></span>

  <span class="keyword">relations</span>
    <a href="#typeOfDecl_942_952" id="typeOfDecl_449_459" title="Referenced at line 61, 66"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_366_370" id="Type_476_480" title="Defined at line 29"><span class="token sort_OpId">Type</span></a></span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><a href="#Var_558_561" id="Var_499_502" title="Referenced at line 43, 61, 62, 67, 67, 68"><span class="token sort_OpId">Var</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <a href="#P_569_570" id="P_542_543" title="Referenced at line 43, 43, 60"><span class="token sort_OpId">P</span></a> <span id="R_544_545" title="Not referenced locally, nor via imports"><span class="token sort_OpId">R</span></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Var_499_502" id="Var_558_561" title="Defined at line 39"><span class="token sort_OpId">Var</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><a href="#P_542_543" id="P_569_570" title="Defined at line 42"><span class="token sort_OpId">P</span></a>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <a href="#P_542_543" id="P_580_581" title="Defined at line 42"><span class="token sort_OpId">P</span></a></span></span>

<span class="keyword">rules</span>

  <span class="keyword">constraint</span> <a href="#typeOfExp_638_647" id="typeOfExp_603_612" title="Referenced at line 49, 52, 53, 54, 56, 63, 65, 72, 74, 75"><span class="token sort_ConstraintId">typeOfExp</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_90_93" id="Exp_623_626" title="Defined at line 12"><span class="token sort_OpId">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_366_370" id="Type_630_634" title="Defined at line 29"><span class="token sort_OpId">Type</span></a></span>

  <a href="#typeOfExp_603_612" id="typeOfExp_638_647" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_648_649" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">,</span> <a href="#Num_114_117" id="Num_651_654" title="Defined at line 15"><span class="token sort_OpId">Num</span></a><span class="operator">(</span> <span class="operator">_</span> <span class="operator">))</span> <span class="operator">=</span> <a href="#NUM_391_394" id="NUM_663_666" title="Defined at line 32"><span class="token sort_OpId">NUM</span></a><span class="operator">(</span> <span class="operator">)</span> <span class="operator">:-</span>
    <span class="keyword">true</span><span class="operator">.</span>

  <a href="#typeOfExp_603_612" id="typeOfExp_686_695" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_747_748" id="s_696_697" title="Referenced at line 53, 54"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <a href="#BinExp_134_140" id="BinExp_699_705" title="Defined at line 16"><span class="token sort_OpId">BinExp</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#e1_750_752" id="e1_707_709" title="Referenced at line 53"><span class="token sort_ConstraintId">e1</span></a></span><span class="operator">,</span> <span class="operator">_,</span> <span class="cons_Var"><a href="#e2_784_786" id="e2_714_716" title="Referenced at line 54"><span class="token sort_ConstraintId">e2</span></a></span> <span class="operator">))</span> <span class="operator">=</span> <a href="#NUM_391_394" id="NUM_722_725" title="Defined at line 32"><span class="token sort_OpId">NUM</span></a><span class="operator">(</span> <span class="operator">)</span> <span class="operator">:-</span>
    <a href="#typeOfExp_603_612" id="typeOfExp_736_745" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#s_696_697" id="s_747_748" title="Defined at line 52"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e1_707_709" id="e1_750_752" title="Defined at line 52"><span class="token sort_ConstraintId">e1</span></a></span> <span class="operator">)</span> <span class="operator">==</span> <a href="#NUM_391_394" id="NUM_758_761" title="Defined at line 32"><span class="token sort_OpId">NUM</span></a><span class="operator">(</span> <span class="operator">),</span>
    <a href="#typeOfExp_603_612" id="typeOfExp_770_779" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#s_696_697" id="s_781_782" title="Defined at line 52"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e2_714_716" id="e2_784_786" title="Defined at line 52"><span class="token sort_ConstraintId">e2</span></a></span> <span class="operator">)</span> <span class="operator">==</span> <a href="#NUM_391_394" id="NUM_792_795" title="Defined at line 32"><span class="token sort_OpId">NUM</span></a><span class="operator">(</span> <span class="operator">).</span>

  <a href="#typeOfExp_603_612" id="typeOfExp_803_812" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_883_884" id="s_813_814" title="Referenced at line 58, 60"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <a href="#Fun_172_175" id="Fun_816_819" title="Defined at line 17"><span class="token sort_OpId">Fun</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#x_958_959" id="x_821_822" title="Referenced at line 61, 61, 62, 62"><span class="token sort_ConstraintId">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#te_886_888" id="te_824_826" title="Referenced at line 58"><span class="token sort_ConstraintId">te</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_1040_1041" id="e_828_829" title="Referenced at line 63"><span class="token sort_ConstraintId">e</span></a></span> <span class="operator">))</span> <span class="operator">=</span> <a href="#FUN_406_409" id="FUN_835_838" title="Defined at line 33"><span class="token sort_OpId">FUN</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#S_894_895" id="S_840_841" title="Referenced at line 58, 61"><span class="token sort_OpId">S</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_1047_1048" id="T_843_844" title="Referenced at line 63"><span class="token sort_OpId">T</span></a></span> <span class="operator">)</span> <span class="operator">:-</span>
    <span class="operator">{</span><span class="cons_Var"><a href="#s_fun_907_912" id="s_fun_855_860" title="Referenced at line 59, 60, 61, 62, 63"><span class="token sort_ConstraintId">s_fun</span></a></span><span class="operator">}</span>
      <a href="#typeOfTypeExp_1425_1438" id="typeOfTypeExp_868_881" title="Defined at line 80"><span class="token sort_ConstraintId">typeOfTypeExp</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#s_813_814" id="s_883_884" title="Defined at line 56"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#te_824_826" id="te_886_888" title="Defined at line 56"><span class="token sort_ConstraintId">te</span></a></span> <span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#S_840_841" id="S_894_895" title="Defined at line 56"><span class="token sort_OpId">S</span></a></span><span class="operator">,</span>
      <span class="keyword">new</span> <span class="cons_Var"><a href="#s_fun_855_860" id="s_fun_907_912" title="Defined at line 57"><span class="token sort_ConstraintId">s_fun</span></a></span><span class="operator">,</span>
      <span class="cons_Var"><a href="#s_fun_855_860" id="s_fun_920_925" title="Defined at line 57"><span class="token sort_ConstraintId">s_fun</span></a></span> <span class="operator">-</span><a href="#P_542_543" id="P_927_928" title="Defined at line 42"><span class="token sort_OpId">P</span></a><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#s_813_814" id="s_931_932" title="Defined at line 56"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span>
      <span class="operator">(!</span><a href="#typeOfDecl_449_459" id="typeOfDecl_942_952" title="Defined at line 36"><span class="token sort_ConstraintId">typeOfDecl</span></a><span class="operator">[</span><span class="cons_StxOccurrence"><a href="#Var_499_502" id="Var_953_956" title="Defined at line 39"><span class="token sort_OpId">Var</span></a><span class="operator">{</span> <span class="cons_Var"><a href="#x_821_822" id="x_958_959" title="Defined at line 56"><span class="token sort_ConstraintId">x</span></a></span> <span class="operator">@</span><span class="cons_Var"><a href="#x_821_822" id="x_961_962" title="Defined at line 56"><span class="token sort_ConstraintId">x</span></a></span> }</span><span class="operator">,</span> <span class="cons_Var"><a href="#S_840_841" id="S_966_967" title="Defined at line 56"><span class="token sort_OpId">S</span></a></span><span class="operator">]</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_fun_855_860" id="s_fun_972_977" title="Defined at line 57"><span class="token sort_ConstraintId">s_fun</span></a></span><span class="operator">,</span>
       <span class="operator">!</span><span class="token sort_ConstraintId">decl</span><span class="operator">[</span><span class="cons_StxOccurrence"><a href="#Var_499_502" id="Var_992_995" title="Defined at line 39"><span class="token sort_OpId">Var</span></a><span class="operator">{</span> <span class="cons_Var"><a href="#x_821_822" id="x_997_998" title="Defined at line 56"><span class="token sort_ConstraintId">x</span></a></span> <span class="operator">@</span><span class="cons_Var"><a href="#x_821_822" id="x_1000_1001" title="Defined at line 56"><span class="token sort_ConstraintId">x</span></a></span> }</span><span class="operator">]</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_fun_855_860" id="s_fun_1008_1013" title="Defined at line 57"><span class="token sort_ConstraintId">s_fun</span></a></span><span class="operator">),</span>
      <a href="#typeOfExp_603_612" id="typeOfExp_1022_1031" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#s_fun_855_860" id="s_fun_1033_1038" title="Defined at line 57"><span class="token sort_ConstraintId">s_fun</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_828_829" id="e_1040_1041" title="Defined at line 56"><span class="token sort_ConstraintId">e</span></a></span> <span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#T_843_844" id="T_1047_1048" title="Defined at line 56"><span class="token sort_OpId">T</span></a></span><span class="operator">.</span>

  <a href="#typeOfExp_603_612" id="typeOfExp_1053_1062" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_1249_1250" id="s_1063_1064" title="Referenced at line 70"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <a href="#Var_208_211" id="Var_1066_1069" title="Defined at line 18"><span class="token sort_OpId">Var</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#x_1136_1137" id="x_1071_1072" title="Referenced at line 67, 67, 67, 67, 68, 68"><span class="token sort_ConstraintId">x</span></a></span> <span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var"><a href="#T_1264_1265" id="T_1078_1079" title="Referenced at line 70"><span class="token sort_OpId">T</span></a></span> <span class="operator">:-</span>
    <span class="keyword">query</span> <a href="#typeOfDecl_449_459" id="typeOfDecl_1093_1103" title="Defined at line 36"><span class="token sort_ConstraintId">typeOfDecl</span></a>
      <span class="keyword">filter</span> <span class="keyword">resolveMatch</span><span class="operator">[</span> <span class="cons_StxOccurrence"><a href="#Var_499_502" id="Var_1131_1134" title="Defined at line 39"><span class="token sort_OpId">Var</span></a><span class="operator">{</span> <span class="cons_Var"><a href="#x_1071_1072" id="x_1136_1137" title="Defined at line 65"><span class="token sort_ConstraintId">x</span></a></span> <span class="operator">@</span><span class="cons_Var"><a href="#x_1071_1072" id="x_1139_1140" title="Defined at line 65"><span class="token sort_ConstraintId">x</span></a></span> }</span> <span class="operator">]</span> <span class="keyword">and</span> <span class="keyword">occurrenceMatch</span><span class="operator">[</span> <span class="cons_StxOccurrence"><a href="#Var_499_502" id="Var_1166_1169" title="Defined at line 39"><span class="token sort_OpId">Var</span></a><span class="operator">{</span> <span class="cons_Var"><a href="#x_1071_1072" id="x_1171_1172" title="Defined at line 65"><span class="token sort_ConstraintId">x</span></a></span> <span class="operator">@</span><span class="cons_Var"><a href="#x_1071_1072" id="x_1174_1175" title="Defined at line 65"><span class="token sort_ConstraintId">x</span></a></span> }</span> <span class="operator">]</span>
      <span class="keyword">min</span> <span class="keyword">resolveLt</span><span class="operator">[</span> <span class="cons_StxOccurrence"><a href="#Var_558_561" id="Var_1201_1204" title="Defined at line 43"><span class="token sort_OpId">Var</span></a><span class="operator">{</span> <span class="cons_Var"><a href="#x_1071_1072" id="x_1206_1207" title="Defined at line 65"><span class="token sort_ConstraintId">x</span></a></span> <span class="operator">@</span><span class="cons_Var"><a href="#x_1071_1072" id="x_1209_1210" title="Defined at line 65"><span class="token sort_ConstraintId">x</span></a></span> }</span> <span class="operator">]</span> <span class="keyword">and</span> <span class="keyword">true</span>
      <span class="keyword">project</span> <span class="operator">*</span>
      <span class="keyword">in</span> <span class="cons_Var"><a href="#s_1063_1064" id="s_1249_1250" title="Defined at line 65"><span class="token sort_ConstraintId">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#T_1078_1079" id="T_1264_1265" title="Defined at line 65"><span class="token sort_OpId">T</span></a></span><span class="operator">))].</span>

  <a href="#typeOfExp_603_612" id="typeOfExp_1273_1282" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_1335_1336" id="s_1283_1284" title="Referenced at line 74, 75"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <a href="#App_228_231" id="App_1286_1289" title="Defined at line 19"><span class="token sort_OpId">App</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#e1_1338_1340" id="e1_1291_1293" title="Referenced at line 74"><span class="token sort_ConstraintId">e1</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e2_1379_1381" id="e2_1295_1297" title="Referenced at line 75"><span class="token sort_ConstraintId">e2</span></a></span> <span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var"><a href="#T_1354_1355" id="T_1303_1304" title="Referenced at line 74"><span class="token sort_OpId">T</span></a></span> <span class="operator">:-</span>
    <span class="operator">{</span><span class="cons_Var"><a href="#S_1351_1352" id="S_1313_1314" title="Referenced at line 74, 76"><span class="token sort_OpId">S</span></a></span> <span class="cons_Var"><a href="#U_1387_1388" id="U_1315_1316" title="Referenced at line 75, 76"><span class="token sort_OpId">U</span></a></span><span class="operator">}</span>
      <a href="#typeOfExp_603_612" id="typeOfExp_1324_1333" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#s_1283_1284" id="s_1335_1336" title="Defined at line 72"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e1_1291_1293" id="e1_1338_1340" title="Defined at line 72"><span class="token sort_ConstraintId">e1</span></a></span> <span class="operator">)</span> <span class="operator">==</span> <a href="#FUN_406_409" id="FUN_1346_1349" title="Defined at line 33"><span class="token sort_OpId">FUN</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#S_1313_1314" id="S_1351_1352" title="Defined at line 73"><span class="token sort_OpId">S</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_1303_1304" id="T_1354_1355" title="Defined at line 72"><span class="token sort_OpId">T</span></a></span> <span class="operator">),</span>
      <a href="#typeOfExp_603_612" id="typeOfExp_1365_1374" title="Defined at line 47"><span class="token sort_ConstraintId">typeOfExp</span></a><span class="operator">(</span> <span class="cons_Var"><a href="#s_1283_1284" id="s_1376_1377" title="Defined at line 72"><span class="token sort_ConstraintId">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e2_1295_1297" id="e2_1379_1381" title="Defined at line 72"><span class="token sort_ConstraintId">e2</span></a></span> <span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#U_1315_1316" id="U_1387_1388" title="Defined at line 73"><span class="token sort_OpId">U</span></a></span><span class="operator">,</span>
      <span class="cons_Var"><a href="#U_1315_1316" id="U_1396_1397" title="Defined at line 73"><span class="token sort_OpId">U</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#S_1313_1314" id="S_1401_1402" title="Defined at line 73"><span class="token sort_OpId">S</span></a></span><span class="operator">.</span>

<span class="keyword">rules</span>

  <span class="keyword">constraint</span> <a href="#typeOfTypeExp_868_881" id="typeOfTypeExp_1425_1438" title="Referenced at line 58, 82, 85, 85, 85"><span class="token sort_ConstraintId">typeOfTypeExp</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TypeExp_264_271" id="TypeExp_1449_1456" title="Defined at line 22"><span class="token sort_OpId">TypeExp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_366_370" id="Type_1460_1464" title="Defined at line 29"><span class="token sort_OpId">Type</span></a></span>

  <a href="#typeOfTypeExp_1425_1438" id="typeOfTypeExp_1468_1481" title="Defined at line 80"><span class="token sort_ConstraintId">typeOfTypeExp</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_1482_1483" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">,</span> <a href="#NumType_292_299" id="NumType_1485_1492" title="Defined at line 25"><span class="token sort_OpId">NumType</span></a><span class="operator">(</span> <span class="operator">))</span> <span class="operator">=</span> <a href="#NUM_391_394" id="NUM_1499_1502" title="Defined at line 32"><span class="token sort_OpId">NUM</span></a><span class="operator">(</span> <span class="operator">)</span> <span class="operator">:-</span>
    <span class="keyword">true</span><span class="operator">.</span>

  <a href="#typeOfTypeExp_1425_1438" id="typeOfTypeExp_1522_1535" title="Defined at line 80"><span class="token sort_ConstraintId">typeOfTypeExp</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_1536_1537" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">,</span> <a href="#FunType_314_321" id="FunType_1539_1546" title="Defined at line 26"><span class="token sort_OpId">FunType</span></a><span class="operator">(</span> <span class="cons_Var">te1</span><span class="operator">,</span> <span class="cons_Var"><span id="te2_1553_1556" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">te2</span></span></span> <span class="operator">))</span> <span class="operator">=</span> <a href="#FUN_406_409" id="FUN_1562_1565" title="Defined at line 33"><span class="token sort_OpId">FUN</span></a><span class="operator">(</span> <a href="#typeOfTypeExp_1425_1438" id="typeOfTypeExp_1567_1580" title="Defined at line 80"><span class="token sort_ConstraintId">typeOfTypeExp</span></a><span class="operator">(</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="cons_Var"><span id="te1_1585_1588" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">te1</span></span></span> <span class="operator">),</span> <a href="#typeOfTypeExp_1425_1438" id="typeOfTypeExp_1592_1605" title="Defined at line 80"><span class="token sort_ConstraintId">typeOfTypeExp</span></a><span class="operator">(</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="cons_Var">te2</span> <span class="operator">)</span> <span class="operator">)</span> <span class="operator">:-</span>
    <span class="keyword">true</span><span class="operator">.</span>
</code></pre></td></tr></tbody></table></div>