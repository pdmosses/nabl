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

  <a href="#programOk_34_3" id="programOk_3_3" title="Defined at line 34"><span class="token sort_Id">programOk</span></a><span class="operator">([</span>
    <span class="cons_Op"><a href="#PartialClass_17_5" id="PartialClass_4_5" title="Defined at line 17"><span class="token sort_Id">PartialClass</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>A"</span><span class="operator">,</span> <span class="operator">[</span>
      <span class="cons_Op"><a href="#Field_20_5" id="Field_5_7" title="Defined at line 20"><span class="token sort_Id">Field</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>x"</span><span class="operator">,</span> <span class="cons_Op"><a href="#Var_23_5" id="Var_5_18" title="Defined at line 23"><span class="token sort_Id">Var</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>y"</span>)</span>)</span>
    ])</span><span class="operator">,</span>
    <span class="cons_Op"><a href="#PartialClass_17_5" id="PartialClass_7_5" title="Defined at line 17"><span class="token sort_Id">PartialClass</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>A"</span><span class="operator">,</span> <span class="operator">[</span>
      <span class="cons_Op"><a href="#Field_20_5" id="Field_8_7" title="Defined at line 20"><span class="token sort_Id">Field</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>y"</span><span class="operator">,</span> <span class="cons_Op"><a href="#Var_23_5" id="Var_8_18" title="Defined at line 23"><span class="token sort_Id">Var</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>x"</span>)</span>)</span>
    ])</span>
  <span class="operator">])</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="#ID_17_20" id="ID_14_9" title="Referenced at line 17, 20, 23"><span class="token sort_Id">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Class_17_41" id="Class_16_9" title="Referenced at line 17, 34, 42"><span class="token sort_Id">Class</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#PartialClass_4_5" id="PartialClass_17_5" title="Referenced at line 4, 7, 44"><span class="token sort_Id">PartialClass</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_14_9" id="ID_17_20" title="Defined at line 14"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Member_19_9" id="Member_17_30" title="Defined at line 19"><span class="token sort_Id">Member</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Class_16_9" id="Class_17_41" title="Defined at line 16"><span class="token sort_Id">Class</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Member_17_30" id="Member_19_9" title="Referenced at line 17, 20, 68"><span class="token sort_Id">Member</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Field_5_7" id="Field_20_5" title="Referenced at line 5, 8, 70"><span class="token sort_Id">Field</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_14_9" id="ID_20_13" title="Defined at line 14"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_22_9" id="Exp_20_18" title="Defined at line 22"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Member_19_9" id="Member_20_25" title="Defined at line 19"><span class="token sort_Id">Member</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Exp_20_18" id="Exp_22_9" title="Referenced at line 20, 23, 76"><span class="token sort_Id">Exp</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Var_5_18" id="Var_23_5" title="Referenced at line 5, 8, 78"><span class="token sort_Id">Var</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_14_9" id="ID_23_11" title="Defined at line 14"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_22_9" id="Exp_23_17" title="Defined at line 22"><span class="token sort_Id">Exp</span></a></span></span>

  <span class="keyword">relations</span>
    <span class="cons_Label"><a href="#var_71_6" id="var_26_5" title="Referenced at line 71, 79"><span class="token sort_Id">var</span></a></span><span class="operator">:</span> <span class="cons_StringSort">string</span>
    <span class="cons_Label"><a href="#class_46_6" id="class_27_5" title="Referenced at line 46, 47"><span class="token sort_Id">class</span></a></span> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_ScopeSort">scope</span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><a href="#P_45_17" id="P_30_12" title="Referenced at line 45, 48, 50, 80, 82"><span class="token sort_Id">P</span></a></span> <span class="cons_Label"><a href="#E_63_8" id="E_30_14" title="Referenced at line 63, 80, 82"><span class="token sort_Id">E</span></a></span>

<span class="keyword">rules</span>

  <a href="#programOk_3_3" id="programOk_34_3" title="Referenced at line 3, 36"><span class="token sort_Id">programOk</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Class_16_9" id="Class_34_20" title="Defined at line 16"><span class="token sort_Id">Class</span></a></span><span class="operator">)</span>

  <a href="#programOk_34_3" id="programOk_36_3" title="Defined at line 34"><span class="token sort_Id">programOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#classes_37_20" id="classes_36_13" title="Referenced at line 37"><span class="token sort_Id">classes</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <a href="#classesOk_41_3" id="classesOk_37_5" title="Defined at line 41"><span class="token sort_Id">classesOk</span></a><span class="operator">(</span><span class="keyword">new</span><span class="operator">,</span> <span class="cons_Var"><a href="#classes_36_13" id="classes_37_20" title="Defined at line 36"><span class="token sort_Id">classes</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#classesOk_37_5" id="classesOk_41_3" title="Referenced at line 37"><span class="token sort_Id">classesOk</span></a> <span class="keyword">maps</span> <a href="#classOk_42_3" id="classOk_41_18" title="Defined at line 42"><span class="token sort_Id">classOk</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>
  <a href="#classOk_41_18" id="classOk_42_3" title="Referenced at line 41, 44"><span class="token sort_Id">classOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Class_16_9" id="Class_42_21" title="Defined at line 16"><span class="token sort_Id">Class</span></a></span>

  <a href="#classOk_42_3" id="classOk_44_3" title="Defined at line 42"><span class="token sort_Id">classOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_45_21" id="s_44_11" title="Referenced at line 45, 46, 51"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#PartialClass_17_5" id="PartialClass_44_14" title="Defined at line 17"><span class="token sort_Id">PartialClass</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_46_12" id="x_44_27" title="Referenced at line 46, 49"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#members_53_19" id="members_44_30" title="Referenced at line 53"><span class="token sort_Id">members</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#s'_45_9" id="s'_44_44" title="Referenced at line 45, 46, 52, 53"><span class="token sort_Id">s'</span></a></span> <span class="cons_Var"><a href="#pcs_51_16" id="pcs_44_47" title="Referenced at line 51, 52"><span class="token sort_Id">pcs</span></a></span><span class="operator">}</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#s'_44_44" id="s'_45_9" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s'_44_44" id="s'_45_13" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="#P_30_12" id="P_45_17" title="Defined at line 30"><span class="token sort_Id">P</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#s_44_11" id="s_45_21" title="Defined at line 44"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <span class="operator">!</span><span class="cons_Label"><a href="#class_27_5" id="class_46_6" title="Defined at line 27"><span class="token sort_Id">class</span></a></span><span class="operator">[</span><span class="cons_Var"><a href="#x_44_27" id="x_46_12" title="Defined at line 44"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s'_44_44" id="s'_46_15" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span><span class="operator">]</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_44_11" id="s_46_22" title="Defined at line 44"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <span class="keyword">query</span> <span class="cons_Label"><a href="#class_27_5" id="class_47_11" title="Defined at line 27"><span class="token sort_Id">class</span></a></span>
      <span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_30_12" id="P_48_14" title="Defined at line 30"><span class="token sort_Id">P</span></a></span>*</span>
        <span class="keyword">and</span> <span class="operator">{</span> <span class="cons_Var"><a href="#x'_49_21" id="x'_49_15" title="Referenced at line 49"><span class="token sort_Id">x'</span></a></span> <span class="operator">:-</span> <span class="cons_Var"><a href="#x'_49_15" id="x'_49_21" title="Defined at line 49"><span class="token sort_Id">x'</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#x_44_27" id="x_49_27" title="Defined at line 44"><span class="token sort_Id">x</span></a></span> <span class="operator">}</span>
      <span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_30_12" id="P_50_15" title="Defined at line 30"><span class="token sort_Id">P</span></a></span>
      <span class="keyword">in</span> <span class="cons_Var"><a href="#s_44_11" id="s_51_10" title="Defined at line 44"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#pcs_44_47" id="pcs_51_16" title="Defined at line 44"><span class="token sort_Id">pcs</span></a></span><span class="operator">,</span>
    <a href="#importPartials_57_3" id="importPartials_52_5" title="Defined at line 57"><span class="token sort_Id">importPartials</span></a><span class="operator">(</span><span class="cons_Var"><a href="#pcs_44_47" id="pcs_52_20" title="Defined at line 44"><span class="token sort_Id">pcs</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s'_44_44" id="s'_52_25" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span><span class="operator">),</span>
    <a href="#membersOk_67_3" id="membersOk_53_5" title="Defined at line 67"><span class="token sort_Id">membersOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s'_44_44" id="s'_53_15" title="Defined at line 44"><span class="token sort_Id">s'</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#members_44_30" id="members_53_19" title="Defined at line 44"><span class="token sort_Id">members</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#importPartials_52_5" id="importPartials_57_3" title="Referenced at line 52"><span class="token sort_Id">importPartials</span></a> <span class="keyword">maps</span> <a href="#importPartial_58_3" id="importPartial_57_23" title="Defined at line 58"><span class="token sort_Id">importPartial</span></a><span class="operator">(</span><span class="keyword">list</span><span class="operator">(*),</span> <span class="operator">*)</span>
  <a href="#importPartial_57_23" id="importPartial_58_3" title="Referenced at line 57, 60, 62"><span class="token sort_Id">importPartial</span></a> <span class="operator">:</span> <span class="operator">(</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_StringSort">string</span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span><span class="operator">))</span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span>

  <a href="#importPartial_58_3" id="importPartial_60_3" title="Defined at line 58"><span class="token sort_Id">importPartial</span></a><span class="operator">((_,</span> <span class="operator">(_,</span> <span class="cons_Var"><span id="s_60_25" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">)),</span> <span class="cons_Var">s</span><span class="operator">).</span>

  <a href="#importPartial_58_3" id="importPartial_62_3" title="Defined at line 58"><span class="token sort_Id">importPartial</span></a><span class="operator">((_,</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#s'_63_12" id="s'_62_25" title="Referenced at line 63"><span class="token sort_Id">s'</span></a></span><span class="operator">)),</span> <span class="cons_Var"><a href="#s_63_5" id="s_62_31" title="Referenced at line 63"><span class="token sort_Id">s</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="cons_Var"><a href="#s_62_31" id="s_63_5" title="Defined at line 62"><span class="token sort_Id">s</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="#E_30_14" id="E_63_8" title="Defined at line 30"><span class="token sort_Id">E</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#s'_62_25" id="s'_63_12" title="Defined at line 62"><span class="token sort_Id">s'</span></a></span><span class="operator">.</span>

<span class="keyword">rules</span>

  <a href="#membersOk_53_5" id="membersOk_67_3" title="Referenced at line 53"><span class="token sort_Id">membersOk</span></a> <span class="keyword">maps</span> <a href="#memberOk_68_3" id="memberOk_67_18" title="Defined at line 68"><span class="token sort_Id">memberOk</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>
  <a href="#memberOk_67_18" id="memberOk_68_3" title="Referenced at line 67, 70"><span class="token sort_Id">memberOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Member_19_9" id="Member_68_22" title="Defined at line 19"><span class="token sort_Id">Member</span></a></span>

  <a href="#memberOk_68_3" id="memberOk_70_3" title="Defined at line 68"><span class="token sort_Id">memberOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_71_16" id="s_70_12" title="Referenced at line 71, 72"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Field_20_5" id="Field_70_15" title="Defined at line 20"><span class="token sort_Id">Field</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_71_10" id="x_70_21" title="Referenced at line 71"><span class="token sort_Id">x</span></a></span><span class="operator">,</span><span class="cons_Var"><a href="#e_72_14" id="e_70_23" title="Referenced at line 72"><span class="token sort_Id">e</span></a></span> )</span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="operator">!</span><span class="cons_Label"><a href="#var_26_5" id="var_71_6" title="Defined at line 26"><span class="token sort_Id">var</span></a></span><span class="operator">[</span><span class="cons_Var"><a href="#x_70_21" id="x_71_10" title="Defined at line 70"><span class="token sort_Id">x</span></a></span><span class="operator">]</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_70_12" id="s_71_16" title="Defined at line 70"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <a href="#expOk_76_3" id="expOk_72_5" title="Defined at line 76"><span class="token sort_Id">expOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_70_12" id="s_72_11" title="Defined at line 70"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_70_23" id="e_72_14" title="Defined at line 70"><span class="token sort_Id">e</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#expOk_72_5" id="expOk_76_3" title="Referenced at line 72, 78"><span class="token sort_Id">expOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_22_9" id="Exp_76_19" title="Defined at line 22"><span class="token sort_Id">Exp</span></a></span>

  <a href="#expOk_76_3" id="expOk_78_3" title="Defined at line 76"><span class="token sort_Id">expOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_84_10" id="s_78_9" title="Referenced at line 84"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Var_23_5" id="Var_78_12" title="Defined at line 23"><span class="token sort_Id">Var</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_81_27" id="x_78_16" title="Referenced at line 81"><span class="token sort_Id">x</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="keyword">query</span> <span class="cons_Label"><a href="#var_26_5" id="var_79_11" title="Defined at line 26"><span class="token sort_Id">var</span></a></span>
      <span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_30_12" id="P_80_14" title="Defined at line 30"><span class="token sort_Id">P</span></a></span>*</span> <span class="cons_Label"><a href="#E_30_14" id="E_80_17" title="Defined at line 30"><span class="token sort_Id">E</span></a></span><span class="operator">?</span>
        <span class="keyword">and</span> <span class="operator">{</span> <span class="cons_Var"><a href="#x'_81_21" id="x'_81_15" title="Referenced at line 81"><span class="token sort_Id">x'</span></a></span> <span class="operator">:-</span> <span class="cons_Var"><a href="#x'_81_15" id="x'_81_21" title="Defined at line 81"><span class="token sort_Id">x'</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#x_78_16" id="x_81_27" title="Defined at line 78"><span class="token sort_Id">x</span></a></span> <span class="operator">}</span>
      <span class="keyword">min</span><span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_30_12" id="P_82_14" title="Defined at line 30"><span class="token sort_Id">P</span></a></span><span class="operator">,</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#E_30_14" id="E_82_21" title="Defined at line 30"><span class="token sort_Id">E</span></a></span><span class="operator">,</span> <span class="cons_Label"><a href="#E_30_14" id="E_82_24" title="Defined at line 30"><span class="token sort_Id">E</span></a></span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_30_12" id="P_82_28" title="Defined at line 30"><span class="token sort_Id">P</span></a></span>
        <span class="keyword">and</span> <span class="keyword">true</span>
      <span class="keyword">in</span> <span class="cons_Var"><a href="#s_78_9" id="s_84_10" title="Defined at line 78"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[_].</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
