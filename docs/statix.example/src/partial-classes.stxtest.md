---
title: partial-classes.stxtest
hide:
  - toc
---

# `partial-classes.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/partial-classes.stxtest]

[pdmosses/nabl/statix.example/src/partial-classes.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/partial-classes.stxtest "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">resolve</span> <span class="operator">{}</span>

  <a href="#programOk_461_470" id="programOk_14_23" title="Defined at line 34"><span class="token sort_Id">programOk</span></a><span class="operator">([</span>
    <span class="cons_Op"><a href="#PartialClass_212_224" id="PartialClass_30_42" title="Defined at line 17"><span class="token sort_Id">PartialClass</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>A"</span><span class="operator">,</span> <span class="operator">[</span>
      <span class="cons_Op"><a href="#Field_287_292" id="Field_56_61" title="Defined at line 20"><span class="token sort_Id">Field</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>x"</span><span class="operator">,</span> <span class="cons_Op"><a href="#Var_344_347" id="Var_67_70" title="Defined at line 23"><span class="token sort_Id">Var</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>y"</span>)</span>)</span>
    ])</span><span class="operator">,</span>
    <span class="cons_Op"><a href="#PartialClass_212_224" id="PartialClass_89_101" title="Defined at line 17"><span class="token sort_Id">PartialClass</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>A"</span><span class="operator">,</span> <span class="operator">[</span>
      <span class="cons_Op"><a href="#Field_287_292" id="Field_115_120" title="Defined at line 20"><span class="token sort_Id">Field</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>y"</span><span class="operator">,</span> <span class="cons_Op"><a href="#Var_344_347" id="Var_126_129" title="Defined at line 23"><span class="token sort_Id">Var</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>x"</span>)</span>)</span>
    ])</span>
  <span class="operator">])</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="#ID_227_229" id="ID_168_170" title="Referenced at line 17, 20, 23"><span class="token sort_Id">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Class_248_253" id="Class_189_194" title="Referenced at line 17, 34, 42"><span class="token sort_Id">Class</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#PartialClass_30_42" id="PartialClass_212_224" title="Referenced at line 4, 7, 44"><span class="token sort_Id">PartialClass</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_168_170" id="ID_227_229" title="Defined at line 14"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Member_263_269" id="Member_237_243" title="Defined at line 19"><span class="token sort_Id">Member</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Class_189_194" id="Class_248_253" title="Defined at line 16"><span class="token sort_Id">Class</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Member_237_243" id="Member_263_269" title="Referenced at line 17, 20, 68"><span class="token sort_Id">Member</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Field_56_61" id="Field_287_292" title="Referenced at line 5, 8, 70"><span class="token sort_Id">Field</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_168_170" id="ID_295_297" title="Defined at line 14"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_323_326" id="Exp_300_303" title="Defined at line 22"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Member_263_269" id="Member_307_313" title="Defined at line 19"><span class="token sort_Id">Member</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Exp_300_303" id="Exp_323_326" title="Referenced at line 20, 23, 76"><span class="token sort_Id">Exp</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Var_67_70" id="Var_344_347" title="Referenced at line 5, 8, 78"><span class="token sort_Id">Var</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_168_170" id="ID_350_352" title="Defined at line 14"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_323_326" id="Exp_356_359" title="Defined at line 22"><span class="token sort_Id">Exp</span></a></span></span>

  <span class="keyword">relations</span>
    <span class="cons_Label"><a href="#var_1168_1171" id="var_377_380" title="Referenced at line 71, 79"><span class="token sort_Id">var</span></a></span><span class="operator">:</span> <span class="cons_StringSort">string</span>
    <span class="cons_Label"><a href="#class_690_695" id="class_393_398" title="Referenced at line 46, 47"><span class="token sort_Id">class</span></a></span> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_ScopeSort">scope</span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><a href="#P_678_679" id="P_447_448" title="Referenced at line 45, 48, 50, 80, 82"><span class="token sort_Id">P</span></a></span> <span class="cons_Label"><a href="#E_1050_1051" id="E_449_450" title="Referenced at line 63, 80, 82"><span class="token sort_Id">E</span></a></span>

<span class="keyword">rules</span>

  <a href="#programOk_14_23" id="programOk_461_470" title="Referenced at line 3, 36"><span class="token sort_Id">programOk</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Class_189_194" id="Class_478_483" title="Defined at line 16"><span class="token sort_Id">Class</span></a></span><span class="operator">)</span>

  <a href="#programOk_461_470" id="programOk_488_497" title="Defined at line 34"><span class="token sort_Id">programOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#classes_529_536" id="classes_498_505" title="Referenced at line 37"><span class="token sort_Id">classes</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <a href="#classesOk_549_558" id="classesOk_514_523" title="Defined at line 41"><span class="token sort_Id">classesOk</span></a><span class="operator">(</span><span class="keyword">new</span><span class="operator">,</span> <span class="cons_Var"><a href="#classes_498_505" id="classes_529_536" title="Defined at line 36"><span class="token sort_Id">classes</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#classesOk_514_523" id="classesOk_549_558" title="Referenced at line 37"><span class="token sort_Id">classesOk</span></a> <span class="keyword">maps</span> <a href="#classOk_586_593" id="classOk_564_571" title="Defined at line 42"><span class="token sort_Id">classOk</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>
  <a href="#classOk_564_571" id="classOk_586_593" title="Referenced at line 41, 44"><span class="token sort_Id">classOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Class_189_194" id="Class_604_609" title="Defined at line 16"><span class="token sort_Id">Class</span></a></span>

  <a href="#classOk_586_593" id="classOk_613_620" title="Defined at line 42"><span class="token sort_Id">classOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_682_683" id="s_621_622" title="Referenced at line 45, 46, 51"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#PartialClass_212_224" id="PartialClass_624_636" title="Defined at line 17"><span class="token sort_Id">PartialClass</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_696_697" id="x_637_638" title="Referenced at line 46, 49"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#members_854_861" id="members_640_647" title="Referenced at line 53"><span class="token sort_Id">members</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#s'_670_672" id="s'_654_656" title="Referenced at line 45, 46, 52, 53"><span class="token sort_Id">s'</span></a></span> <span class="cons_Var"><a href="#pcs_802_805" id="pcs_657_660" title="Referenced at line 51, 52"><span class="token sort_Id">pcs</span></a></span><span class="operator">}</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#s'_654_656" id="s'_670_672" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s'_654_656" id="s'_674_676" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="#P_447_448" id="P_678_679" title="Defined at line 30"><span class="token sort_Id">P</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#s_621_622" id="s_682_683" title="Defined at line 44"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <span class="operator">!</span><span class="cons_Label"><a href="#class_393_398" id="class_690_695" title="Defined at line 27"><span class="token sort_Id">class</span></a></span><span class="operator">[</span><span class="cons_Var"><a href="#x_637_638" id="x_696_697" title="Defined at line 44"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s'_654_656" id="s'_699_701" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span><span class="operator">]</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_621_622" id="s_706_707" title="Defined at line 44"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <span class="keyword">query</span> <span class="cons_Label"><a href="#class_393_398" id="class_719_724" title="Defined at line 27"><span class="token sort_Id">class</span></a></span>
      <span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_447_448" id="P_738_739" title="Defined at line 30"><span class="token sort_Id">P</span></a></span>*</span>
        <span class="keyword">and</span> <span class="operator">{</span> <span class="cons_Var"><a href="#x'_761_763" id="x'_755_757" title="Referenced at line 49"><span class="token sort_Id">x'</span></a></span> <span class="operator">:-</span> <span class="cons_Var"><a href="#x'_755_757" id="x'_761_763" title="Defined at line 49"><span class="token sort_Id">x'</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#x_637_638" id="x_767_768" title="Defined at line 44"><span class="token sort_Id">x</span></a></span> <span class="operator">}</span>
      <span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_447_448" id="P_785_786" title="Defined at line 30"><span class="token sort_Id">P</span></a></span>
      <span class="keyword">in</span> <span class="cons_Var"><a href="#s_621_622" id="s_796_797" title="Defined at line 44"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#pcs_657_660" id="pcs_802_805" title="Defined at line 44"><span class="token sort_Id">pcs</span></a></span><span class="operator">,</span>
    <a href="#importPartials_874_888" id="importPartials_811_825" title="Defined at line 57"><span class="token sort_Id">importPartials</span></a><span class="operator">(</span><span class="cons_Var"><a href="#pcs_657_660" id="pcs_826_829" title="Defined at line 44"><span class="token sort_Id">pcs</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s'_654_656" id="s'_831_833" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span><span class="operator">),</span>
    <a href="#membersOk_1068_1077" id="membersOk_840_849" title="Defined at line 67"><span class="token sort_Id">membersOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s'_654_656" id="s'_850_852" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#members_640_647" id="members_854_861" title="Defined at line 44"><span class="token sort_Id">members</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#importPartials_811_825" id="importPartials_874_888" title="Referenced at line 52"><span class="token sort_Id">importPartials</span></a> <span class="keyword">maps</span> <a href="#importPartial_922_935" id="importPartial_894_907" title="Defined at line 58"><span class="token sort_Id">importPartial</span></a><span class="operator">(</span><span class="keyword">list</span><span class="operator">(*),</span> <span class="operator">*)</span>
  <a href="#importPartial_894_907" id="importPartial_922_935" title="Referenced at line 57, 60, 62"><span class="token sort_Id">importPartial</span></a> <span class="operator">:</span> <span class="operator">(</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_StringSort">string</span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span><span class="operator">))</span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span>

  <a href="#importPartial_922_935" id="importPartial_975_988" title="Defined at line 58"><span class="token sort_Id">importPartial</span></a><span class="operator">((_,</span> <span class="operator">(_,</span> <span class="cons_Var"><span id="s_997_998" title="Not referenced locally, nor via imports"><span class="token sort_Id">s</span></span></span><span class="operator">)),</span> <span class="cons_Var">s</span><span class="operator">).</span>

  <a href="#importPartial_922_935" id="importPartial_1009_1022" title="Defined at line 58"><span class="token sort_Id">importPartial</span></a><span class="operator">((_,</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#s'_1054_1056" id="s'_1031_1033" title="Referenced at line 63"><span class="token sort_Id">s'</span></a></span><span class="operator">)),</span> <span class="cons_Var"><a href="#s_1047_1048" id="s_1037_1038" title="Referenced at line 63"><span class="token sort_Id">s</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="cons_Var"><a href="#s_1037_1038" id="s_1047_1048" title="Defined at line 62"><span class="token sort_Id">s</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="#E_449_450" id="E_1050_1051" title="Defined at line 30"><span class="token sort_Id">E</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#s'_1031_1033" id="s'_1054_1056" title="Defined at line 62"><span class="token sort_Id">s'</span></a></span><span class="operator">.</span>

<span class="keyword">rules</span>

  <a href="#membersOk_840_849" id="membersOk_1068_1077" title="Referenced at line 53"><span class="token sort_Id">membersOk</span></a> <span class="keyword">maps</span> <a href="#memberOk_1106_1114" id="memberOk_1083_1091" title="Defined at line 68"><span class="token sort_Id">memberOk</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>
  <a href="#memberOk_1083_1091" id="memberOk_1106_1114" title="Referenced at line 67, 70"><span class="token sort_Id">memberOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Member_263_269" id="Member_1125_1131" title="Defined at line 19"><span class="token sort_Id">Member</span></a></span>

  <a href="#memberOk_1106_1114" id="memberOk_1135_1143" title="Defined at line 68"><span class="token sort_Id">memberOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_1178_1179" id="s_1144_1145" title="Referenced at line 71, 72"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Field_287_292" id="Field_1147_1152" title="Defined at line 20"><span class="token sort_Id">Field</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_1172_1173" id="x_1153_1154" title="Referenced at line 71"><span class="token sort_Id">x</span></a></span><span class="operator">,</span><span class="cons_Var"><a href="#e_1194_1195" id="e_1155_1156" title="Referenced at line 72"><span class="token sort_Id">e</span></a></span> )</span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="operator">!</span><span class="cons_Label"><a href="#var_377_380" id="var_1168_1171" title="Defined at line 26"><span class="token sort_Id">var</span></a></span><span class="operator">[</span><span class="cons_Var"><a href="#x_1153_1154" id="x_1172_1173" title="Defined at line 70"><span class="token sort_Id">x</span></a></span><span class="operator">]</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_1144_1145" id="s_1178_1179" title="Defined at line 70"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <a href="#expOk_1208_1213" id="expOk_1185_1190" title="Defined at line 76"><span class="token sort_Id">expOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_1144_1145" id="s_1191_1192" title="Defined at line 70"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_1155_1156" id="e_1194_1195" title="Defined at line 70"><span class="token sort_Id">e</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#expOk_1185_1190" id="expOk_1208_1213" title="Referenced at line 72, 78"><span class="token sort_Id">expOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_323_326" id="Exp_1224_1227" title="Defined at line 22"><span class="token sort_Id">Exp</span></a></span>

  <a href="#expOk_1208_1213" id="expOk_1231_1236" title="Defined at line 76"><span class="token sort_Id">expOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_1369_1370" id="s_1237_1238" title="Referenced at line 84"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Var_344_347" id="Var_1240_1243" title="Defined at line 23"><span class="token sort_Id">Var</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_1310_1311" id="x_1244_1245" title="Referenced at line 81"><span class="token sort_Id">x</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="keyword">query</span> <span class="cons_Label"><a href="#var_377_380" id="var_1261_1264" title="Defined at line 26"><span class="token sort_Id">var</span></a></span>
      <span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_447_448" id="P_1278_1279" title="Defined at line 30"><span class="token sort_Id">P</span></a></span>*</span> <span class="cons_Label"><a href="#E_449_450" id="E_1281_1282" title="Defined at line 30"><span class="token sort_Id">E</span></a></span><span class="operator">?</span>
        <span class="keyword">and</span> <span class="operator">{</span> <span class="cons_Var"><a href="#x'_1304_1306" id="x'_1298_1300" title="Referenced at line 81"><span class="token sort_Id">x'</span></a></span> <span class="operator">:-</span> <span class="cons_Var"><a href="#x'_1298_1300" id="x'_1304_1306" title="Defined at line 81"><span class="token sort_Id">x'</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#x_1244_1245" id="x_1310_1311" title="Defined at line 78"><span class="token sort_Id">x</span></a></span> <span class="operator">}</span>
      <span class="keyword">min</span><span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_447_448" id="P_1327_1328" title="Defined at line 30"><span class="token sort_Id">P</span></a></span><span class="operator">,</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#E_449_450" id="E_1334_1335" title="Defined at line 30"><span class="token sort_Id">E</span></a></span><span class="operator">,</span> <span class="cons_Label"><a href="#E_449_450" id="E_1337_1338" title="Defined at line 30"><span class="token sort_Id">E</span></a></span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_447_448" id="P_1341_1342" title="Defined at line 30"><span class="token sort_Id">P</span></a></span>
        <span class="keyword">and</span> <span class="keyword">true</span>
      <span class="keyword">in</span> <span class="cons_Var"><a href="#s_1237_1238" id="s_1369_1370" title="Defined at line 78"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[_].</span>

</code></pre></td></tr></tbody></table></div>