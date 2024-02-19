---
title: Type.sdf3
hide:
  - toc
---

# `Type.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/Type.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/Type.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/Type.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/lang/Type_1_8" title="a definition with no references">statix/lang/Type</span>

<span class="keyword">imports</span>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/API.sdf3/#nabl2/API_1_8" id="nabl2/API_5_3" title="a reference to a single-file definition">nabl2/API</a>

  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_7_3" title="a reference to a single-file definition">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_8_3" title="a reference to a single-file definition">statix/lang/Core</a>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/API.sdf3/#statix/API_1_8" id="statix/API_10_3" title="a reference to a single-file definition">statix/API</a>

<span class="keyword">sorts</span>

  <span id="IType_14_3" title="a definition with no references">IType</span> <span class="layout">// internal type</span>
  <button class="modal-open" id="TType_15_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button> <span class="layout">// term type</span>

<span class="keyword">context-free syntax</span>

  <span id="IType_19_3" title="a definition with no references">IType</span>.<span class="cons_Constructor"><span id="PRED_19_9" title="a definition with no references">PRED</span></span> = [[<a href="#TTypes_24_3" id="TTypes_19_18" title="a reference to a single-file definition">TTypes</a>]]
  <span id="IType_20_3" title="a definition with no references">IType</span>.<span class="cons_Constructor"><span id="FUN_20_9" title="a definition with no references">FUN</span></span>  = [[<a href="#TTypes_24_3" id="TTypes_20_18" title="a reference to a single-file definition">TTypes</a>] <span class="cons_String">-&gt;</span> [<a href="#TType_15_3" id="TType_20_30" title="a reference to a single-file definition">TType</a>]]
  <span id="IType_21_3" title="a definition with no references">IType</span>.<span class="cons_Constructor"><span id="NS_21_9" title="a definition with no references">NS</span></span>   = [[<a href="#TTypes_24_3" id="TTypes_21_18" title="a reference to a single-file definition">TTypes</a>]]
  <span id="IType_22_3" title="a definition with no references">IType</span>.<span class="cons_Constructor"><span id="OP_22_9" title="a definition with no references">OP</span></span>   = [[<a href="#TTypes_24_3" id="TTypes_22_18" title="a reference to a single-file definition">TTypes</a>] <span class="cons_String">-&gt;</span> [<a href="#TType_15_3" id="TType_22_30" title="a reference to a single-file definition">TType</a>]]

  <button class="modal-open" id="TTypes_24_3" title="a definition with multiple references" data-urls="#TTypes line 19_18, 20_18, 21_18, 22_18, 35_25">TTypes</button> = {<a href="#TType_15_3" id="TType_24_13" title="a reference to a single-file definition">TType</a> <span class="cons_Lit">" * "</span>}*

  <button class="modal-open" id="TType_26_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="SORT_26_9" title="a definition with no references">SORT</span></span>       = &lt;&lt;<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/API.sdf3/#NaBL2Occurrence_10_3" id="NaBL2Occurrence_26_24" title="a reference to a single-file definition">NaBL2Occurrence</a>&gt;&gt;
  <button class="modal-open" id="TType_27_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="INT_27_9" title="a definition with no references">INT</span></span>        = &lt;<span class="cons_String">int</span>&gt;
  <button class="modal-open" id="TType_28_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="STRING_28_9" title="a definition with no references">STRING</span></span>     = &lt;<span class="cons_String">string</span>&gt;
  <button class="modal-open" id="TType_29_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="PATH_29_9" title="a definition with no references">PATH</span></span>       = &lt;<span class="cons_String">path</span>&gt;
  <button class="modal-open" id="TType_30_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="LABEL_30_9" title="a definition with no references">LABEL</span></span>      = &lt;<span class="cons_String">label</span>&gt;
  <button class="modal-open" id="TType_31_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="OCCURRENCE_31_9" title="a definition with no references">OCCURRENCE</span></span> = &lt;<span class="cons_String">occurrence</span>&gt;
  <button class="modal-open" id="TType_32_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="AST_ID_32_9" title="a definition with no references">AST_ID</span></span>     = &lt;<span class="cons_String">astId</span>&gt;
  <button class="modal-open" id="TType_33_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="SCOPE_33_9" title="a definition with no references">SCOPE</span></span>      = &lt;<span class="cons_String">scope</span>&gt;
  <button class="modal-open" id="TType_34_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="LIST_34_9" title="a definition with no references">LIST</span></span>       = &lt;<span class="cons_String">list(</span>&lt;<a href="#TType_15_3" id="TType_34_29" title="a reference to a single-file definition">TType</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="TType_35_3" title="a definition with multiple references" data-urls="#TType line 20_30, 22_30, 24_13, 34_29">TType</button>.<span class="cons_Constructor"><span id="TUPLE_35_9" title="a definition with no references">TUPLE</span></span>      = &lt;<span class="cons_String">(</span>&lt;<a href="#TTypes_24_3" id="TTypes_35_25" title="a reference to a single-file definition">TTypes</a>&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">sorts</span>

  <button class="modal-open" id="ExtOrigin_39_3" title="a definition with multiple references" data-urls="#ExtOrigin line 45_53, 46_53, 47_52, 48_57, 49_57, 81_127">ExtOrigin</button> <span class="layout">// custom prettyprint rule in statix/lang/scope-extension.str</span>

<span class="keyword">context-free syntax</span>

  <span id="ExtConstraints_43_3" title="a definition with no references">ExtConstraints</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtConstraint_45_3" id="ExtConstraint_43_25" title="a reference to a single-file definition">ExtConstraint</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#ExtConstraint_43_25" id="ExtConstraint_45_3" title="a definition with a single reference">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtProvides_45_17" title="a definition with no references">ExtProvides</span></span>  = [[<a href="#ExtSet_54_3" id="ExtSet_45_34" title="a reference to a single-file definition">ExtSet</a>] <span class="cons_String">!</span> [<a href="#ExtSet_54_3" id="ExtSet_45_45" title="a reference to a single-file definition">ExtSet</a>][<a href="#ExtOrigin_39_3" id="ExtOrigin_45_53" title="a reference to a single-file definition">ExtOrigin</a>]]
  <a href="#ExtConstraint_43_25" id="ExtConstraint_46_3" title="a definition with a single reference">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtRequires_46_17" title="a definition with no references">ExtRequires</span></span>  = [[<a href="#ExtSet_54_3" id="ExtSet_46_34" title="a reference to a single-file definition">ExtSet</a>] <span class="cons_String">?</span> [<a href="#ExtSet_54_3" id="ExtSet_46_45" title="a reference to a single-file definition">ExtSet</a>][<a href="#ExtOrigin_39_3" id="ExtOrigin_46_53" title="a reference to a single-file definition">ExtOrigin</a>]]
  <a href="#ExtConstraint_43_25" id="ExtConstraint_47_3" title="a definition with a single reference">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtIsCovered_47_17" title="a definition with no references">ExtIsCovered</span></span> = [[<a href="#ExtSet_54_3" id="ExtSet_47_34" title="a reference to a single-file definition">ExtSet</a>] <span class="cons_String">is</span> <span class="cons_String">closed</span>[<a href="#ExtOrigin_39_3" id="ExtOrigin_47_52" title="a reference to a single-file definition">ExtOrigin</a>]]
  <a href="#ExtConstraint_43_25" id="ExtConstraint_48_3" title="a definition with a single reference">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtProvidesEsc_48_17" title="a definition with no references">ExtProvidesEsc</span></span>  = [[<a href="#ExtSet_54_3" id="ExtSet_48_37" title="a reference to a single-file definition">ExtSet</a>] <span class="cons_String">^!</span> [<a href="#ExtSet_54_3" id="ExtSet_48_49" title="a reference to a single-file definition">ExtSet</a>][<a href="#ExtOrigin_39_3" id="ExtOrigin_48_57" title="a reference to a single-file definition">ExtOrigin</a>]]
  <a href="#ExtConstraint_43_25" id="ExtConstraint_49_3" title="a definition with a single reference">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtRequiresEsc_49_17" title="a definition with no references">ExtRequiresEsc</span></span>  = [[<a href="#ExtSet_54_3" id="ExtSet_49_37" title="a reference to a single-file definition">ExtSet</a>] <span class="cons_String">^?</span> [<a href="#ExtSet_54_3" id="ExtSet_49_49" title="a reference to a single-file definition">ExtSet</a>][<a href="#ExtOrigin_39_3" id="ExtOrigin_49_57" title="a reference to a single-file definition">ExtOrigin</a>]]


  <span id="ExtSets_52_3" title="a definition with no references">ExtSets</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtSet_54_3" id="ExtSet_52_18" title="a reference to a single-file definition">ExtSet</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <button class="modal-open" id="ExtSet_54_3" title="a definition with multiple references" data-urls="#ExtSet line 45_34, 45_45, 46_34, 46_45, 47_34, 48_37, 48_49, 49_37, 49_49, 52_18, 71_13, 76_24">ExtSet</button>.<span class="cons_Constructor"><span id="ExtParam_54_10" title="a definition with no references">ExtParam</span></span> = [[<a href="#ExtId_61_3" id="ExtId_54_23" title="a reference to a single-file definition">ExtId</a>]<span class="cons_String">.</span>[<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/API.sdf3/#Stx-INT_5_3" id="Stx-INT_54_31" title="a reference to a single-file definition">Stx-INT</a>]]
  <button class="modal-open" id="ExtSet_55_3" title="a definition with multiple references" data-urls="#ExtSet line 45_34, 45_45, 46_34, 46_45, 47_34, 48_37, 48_49, 49_37, 49_49, 52_18, 71_13, 76_24">ExtSet</button>.<span class="cons_Constructor"><span id="ExtVar_55_10" title="a definition with no references">ExtVar</span></span>   = [[<a href="#ExtId_61_3" id="ExtId_55_23" title="a reference to a single-file definition">ExtId</a>]]
  <button class="modal-open" id="ExtSet_56_3" title="a definition with multiple references" data-urls="#ExtSet line 45_34, 45_45, 46_34, 46_45, 47_34, 48_37, 48_49, 49_37, 49_49, 52_18, 71_13, 76_24">ExtSet</button>.<span class="cons_Constructor"><span id="ExtLit_56_10" title="a definition with no references">ExtLit</span></span>   = [<span class="cons_String">{</span>[{<a href="#ExtLabel_65_3" id="ExtLabel_56_25" title="a reference to a single-file definition">ExtLabel</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">}</span>]
  <button class="modal-open" id="ExtSet_57_3" title="a definition with multiple references" data-urls="#ExtSet line 45_34, 45_45, 46_34, 46_45, 47_34, 48_37, 48_49, 49_37, 49_49, 52_18, 71_13, 76_24">ExtSet</button>.<span class="cons_Constructor"><span id="ExtAll_57_10" title="a definition with no references">ExtAll</span></span>   = <span class="cons_Lit">"*"</span>
  <button class="modal-open" id="ExtSet_58_3" title="a definition with multiple references" data-urls="#ExtSet line 45_34, 45_45, 46_34, 46_45, 47_34, 48_37, 48_49, 49_37, 49_49, 52_18, 71_13, 76_24">ExtSet</button>.<span class="cons_Constructor"><span id="ExtNone_58_10" title="a definition with no references">ExtNone</span></span>  = <span class="cons_Lit">"0"</span>


  <button class="modal-open" id="ExtId_61_3" title="a definition with multiple references" data-urls="#ExtId line 54_23, 55_23">ExtId</button>.<span class="cons_Constructor"><span id="ExtRef_61_9" title="a definition with no references">ExtRef</span></span>  = &lt;<span class="cons_String">ref</span> &lt;<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/API.sdf3/#NaBL2Occurrence_10_3" id="NaBL2Occurrence_61_25" title="a reference to a single-file definition">NaBL2Occurrence</a>&gt;&gt;
  <button class="modal-open" id="ExtId_62_3" title="a definition with multiple references" data-urls="#ExtId line 54_23, 55_23">ExtId</button>.<span class="cons_Constructor"><span id="ExtDecl_62_9" title="a definition with no references">ExtDecl</span></span> = &lt;<span class="cons_String">decl</span> &lt;<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/API.sdf3/#NaBL2Occurrence_10_3" id="NaBL2Occurrence_62_26" title="a reference to a single-file definition">NaBL2Occurrence</a>&gt;&gt;


  <a href="#ExtLabel_56_25" id="ExtLabel_65_3" title="a definition with a single reference">ExtLabel</a> = <a href="../Core.sdf3/#RelRef_165_3" id="RelRef_65_14" title="a reference to a single-file definition">RelRef</a>
  <a href="#ExtLabel_56_25" id="ExtLabel_66_3" title="a definition with a single reference">ExtLabel</a> = <a href="../Core.sdf3/#EdgeRef_198_3" id="EdgeRef_66_14" title="a reference to a single-file definition">EdgeRef</a>


  <span id="ExtEqs_69_3" title="a definition with no references">ExtEqs</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtEq_71_3" id="ExtEq_69_17" title="a reference to a single-file definition">ExtEq</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#ExtEq_69_17" id="ExtEq_71_3" title="a definition with a single reference">ExtEq</a> = [[<a href="#ExtSet_54_3" id="ExtSet_71_13" title="a reference to a single-file definition">ExtSet</a>] <span class="cons_String">:=</span> [<a href="#ExtOp_74_3" id="ExtOp_71_25" title="a reference to a single-file definition">ExtOp</a>]]


  <button class="modal-open" id="ExtOp_74_3" title="a definition with multiple references" data-urls="#ExtOp line 71_25, 74_33, 75_33">ExtOp</button>.<span class="cons_Constructor"><span id="Union_74_9" title="a definition with no references">Union</span></span>        = [<span class="cons_String">union(</span>[{<a href="#ExtOp_74_3" id="ExtOp_74_33" title="a reference to a single-file definition">ExtOp</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <button class="modal-open" id="ExtOp_75_3" title="a definition with multiple references" data-urls="#ExtOp line 71_25, 74_33, 75_33">ExtOp</button>.<span class="cons_Constructor"><span id="Intersection_75_9" title="a definition with no references">Intersection</span></span> = [<span class="cons_String">isect(</span>[{<a href="#ExtOp_74_3" id="ExtOp_75_33" title="a reference to a single-file definition">ExtOp</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <button class="modal-open" id="ExtOp_76_3" title="a definition with multiple references" data-urls="#ExtOp line 71_25, 74_33, 75_33">ExtOp</button>              = <a href="#ExtSet_54_3" id="ExtSet_76_24" title="a reference to a single-file definition">ExtSet</a>

<span class="keyword">context-free syntax</span>

  <span id="PatternConstraint_80_3" title="a definition with no references">PatternConstraint</span>.<span class="cons_Constructor"><span id="DistinctPatterns_80_21" title="a definition with no references">DistinctPatterns</span></span> = &lt;<span class="cons_String">distinct</span> <span class="cons_String">patterns</span> &lt;{<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/API.sdf3/#NaBL2Occurrence_10_3" id="NaBL2Occurrence_80_61" title="a reference to a single-file definition">NaBL2Occurrence</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <span id="PatternConstraint_81_3" title="a definition with no references">PatternConstraint</span>.<span class="cons_Constructor"><span id="NoDuplicatePatterns_81_21" title="a definition with no references">NoDuplicatePatterns</span></span> = &lt;<span class="cons_String">patterns</span> <span class="cons_String">{</span>&lt;{<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/API.sdf3/#NaBL2Occurrence_10_3" id="NaBL2Occurrence_81_56" title="a reference to a single-file definition">NaBL2Occurrence</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span> <span class="cons_String">do</span> <span class="cons_String">not</span> <span class="cons_String">duplicate</span> <span class="cons_String">{</span>&lt;{<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/API.sdf3/#NaBL2Occurrence_10_3" id="NaBL2Occurrence_81_101" title="a reference to a single-file definition">NaBL2Occurrence</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span> &lt;<a href="#ExtOrigin_39_3" id="ExtOrigin_81_127" title="a reference to a single-file definition">ExtOrigin</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
