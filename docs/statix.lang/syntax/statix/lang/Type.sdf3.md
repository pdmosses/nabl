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
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/lang/Type_1_8" title="Not referenced">statix/lang/Type</span>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/API</span>

  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_7_3" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_8_3" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

  <span title="External reference">statix/API</span>

<span class="keyword">sorts</span>

  <span id="IType_14_3" title="Not referenced">IType</span> <span class="layout">// internal type</span>
  <a href="#TType_20_30" id="TType_15_3" title="Referenced at line 20, 22, 24, 34">TType</a> <span class="layout">// term type</span>

<span class="keyword">context-free syntax</span>

  <span id="IType_19_3" title="Not referenced">IType</span>.<span class="cons_Constructor"><span id="PRED_19_9" title="Not referenced">PRED</span></span> = [[<a href="#TTypes_24_3" id="TTypes_19_18" title="Defined at line 24">TTypes</a>]]
  <span id="IType_20_3" title="Not referenced">IType</span>.<span class="cons_Constructor"><span id="FUN_20_9" title="Not referenced">FUN</span></span>  = [[<a href="#TTypes_24_3" id="TTypes_20_18" title="Defined at line 24">TTypes</a>] <span class="cons_String">-&gt;</span> [<a href="#TType_15_3" id="TType_20_30" title="Defined at line 15, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35">TType</a>]]
  <span id="IType_21_3" title="Not referenced">IType</span>.<span class="cons_Constructor"><span id="NS_21_9" title="Not referenced">NS</span></span>   = [[<a href="#TTypes_24_3" id="TTypes_21_18" title="Defined at line 24">TTypes</a>]]
  <span id="IType_22_3" title="Not referenced">IType</span>.<span class="cons_Constructor"><span id="OP_22_9" title="Not referenced">OP</span></span>   = [[<a href="#TTypes_24_3" id="TTypes_22_18" title="Defined at line 24">TTypes</a>] <span class="cons_String">-&gt;</span> [<a href="#TType_15_3" id="TType_22_30" title="Defined at line 15, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35">TType</a>]]

  <a href="#TTypes_19_18" id="TTypes_24_3" title="Referenced at line 19, 20, 21, 22, 35">TTypes</a> = {<a href="#TType_15_3" id="TType_24_13" title="Defined at line 15, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35">TType</a> <span class="cons_Lit">" * "</span>}*

  <a href="#TType_20_30" id="TType_26_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="SORT_26_9" title="Not referenced">SORT</span></span>       = &lt;&lt;<span title="External reference">NaBL2Occurrence</span>&gt;&gt;
  <a href="#TType_20_30" id="TType_27_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="INT_27_9" title="Not referenced">INT</span></span>        = &lt;<span class="cons_String">int</span>&gt;
  <a href="#TType_20_30" id="TType_28_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="STRING_28_9" title="Not referenced">STRING</span></span>     = &lt;<span class="cons_String">string</span>&gt;
  <a href="#TType_20_30" id="TType_29_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="PATH_29_9" title="Not referenced">PATH</span></span>       = &lt;<span class="cons_String">path</span>&gt;
  <a href="#TType_20_30" id="TType_30_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="LABEL_30_9" title="Not referenced">LABEL</span></span>      = &lt;<span class="cons_String">label</span>&gt;
  <a href="#TType_20_30" id="TType_31_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="OCCURRENCE_31_9" title="Not referenced">OCCURRENCE</span></span> = &lt;<span class="cons_String">occurrence</span>&gt;
  <a href="#TType_20_30" id="TType_32_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="AST_ID_32_9" title="Not referenced">AST_ID</span></span>     = &lt;<span class="cons_String">astId</span>&gt;
  <a href="#TType_20_30" id="TType_33_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="SCOPE_33_9" title="Not referenced">SCOPE</span></span>      = &lt;<span class="cons_String">scope</span>&gt;
  <a href="#TType_20_30" id="TType_34_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="LIST_34_9" title="Not referenced">LIST</span></span>       = &lt;<span class="cons_String">list(</span>&lt;<a href="#TType_15_3" id="TType_34_29" title="Defined at line 15, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35">TType</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#TType_20_30" id="TType_35_3" title="Referenced at line 20, 22, 24, 34">TType</a>.<span class="cons_Constructor"><span id="TUPLE_35_9" title="Not referenced">TUPLE</span></span>      = &lt;<span class="cons_String">(</span>&lt;<a href="#TTypes_24_3" id="TTypes_35_25" title="Defined at line 24">TTypes</a>&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">sorts</span>

  <a href="#ExtOrigin_45_53" id="ExtOrigin_39_3" title="Referenced at line 45, 46, 47, 48, 49, 81">ExtOrigin</a> <span class="layout">// custom prettyprint rule in statix/lang/scope-extension.str</span>

<span class="keyword">context-free syntax</span>

  <span id="ExtConstraints_43_3" title="Not referenced">ExtConstraints</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtConstraint_45_3" id="ExtConstraint_43_25" title="Defined at line 45, 46, 47, 48, 49">ExtConstraint</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#ExtConstraint_43_25" id="ExtConstraint_45_3" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtProvides_45_17" title="Not referenced">ExtProvides</span></span>  = [[<a href="#ExtSet_54_3" id="ExtSet_45_34" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">!</span> [<a href="#ExtSet_54_3" id="ExtSet_45_45" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>][<a href="#ExtOrigin_39_3" id="ExtOrigin_45_53" title="Defined at line 39">ExtOrigin</a>]]
  <a href="#ExtConstraint_43_25" id="ExtConstraint_46_3" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtRequires_46_17" title="Not referenced">ExtRequires</span></span>  = [[<a href="#ExtSet_54_3" id="ExtSet_46_34" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">?</span> [<a href="#ExtSet_54_3" id="ExtSet_46_45" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>][<a href="#ExtOrigin_39_3" id="ExtOrigin_46_53" title="Defined at line 39">ExtOrigin</a>]]
  <a href="#ExtConstraint_43_25" id="ExtConstraint_47_3" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtIsCovered_47_17" title="Not referenced">ExtIsCovered</span></span> = [[<a href="#ExtSet_54_3" id="ExtSet_47_34" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">is</span> <span class="cons_String">closed</span>[<a href="#ExtOrigin_39_3" id="ExtOrigin_47_52" title="Defined at line 39">ExtOrigin</a>]]
  <a href="#ExtConstraint_43_25" id="ExtConstraint_48_3" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtProvidesEsc_48_17" title="Not referenced">ExtProvidesEsc</span></span>  = [[<a href="#ExtSet_54_3" id="ExtSet_48_37" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">^!</span> [<a href="#ExtSet_54_3" id="ExtSet_48_49" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>][<a href="#ExtOrigin_39_3" id="ExtOrigin_48_57" title="Defined at line 39">ExtOrigin</a>]]
  <a href="#ExtConstraint_43_25" id="ExtConstraint_49_3" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtRequiresEsc_49_17" title="Not referenced">ExtRequiresEsc</span></span>  = [[<a href="#ExtSet_54_3" id="ExtSet_49_37" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">^?</span> [<a href="#ExtSet_54_3" id="ExtSet_49_49" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>][<a href="#ExtOrigin_39_3" id="ExtOrigin_49_57" title="Defined at line 39">ExtOrigin</a>]]


  <span id="ExtSets_52_3" title="Not referenced">ExtSets</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtSet_54_3" id="ExtSet_52_18" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#ExtSet_45_34" id="ExtSet_54_3" title="Referenced at line 45, 46, 47, 48, 49, 52, 71, 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtParam_54_10" title="Not referenced">ExtParam</span></span> = [[<a href="#ExtId_61_3" id="ExtId_54_23" title="Defined at line 61, 62">ExtId</a>]<span class="cons_String">.</span>[<span title="External reference">Stx-INT</span>]]
  <a href="#ExtSet_45_34" id="ExtSet_55_3" title="Referenced at line 45, 46, 47, 48, 49, 52, 71, 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtVar_55_10" title="Not referenced">ExtVar</span></span>   = [[<a href="#ExtId_61_3" id="ExtId_55_23" title="Defined at line 61, 62">ExtId</a>]]
  <a href="#ExtSet_45_34" id="ExtSet_56_3" title="Referenced at line 45, 46, 47, 48, 49, 52, 71, 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtLit_56_10" title="Not referenced">ExtLit</span></span>   = [<span class="cons_String">{</span>[{<a href="#ExtLabel_65_3" id="ExtLabel_56_25" title="Defined at line 65, 66">ExtLabel</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">}</span>]
  <a href="#ExtSet_45_34" id="ExtSet_57_3" title="Referenced at line 45, 46, 47, 48, 49, 52, 71, 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtAll_57_10" title="Not referenced">ExtAll</span></span>   = <span class="cons_Lit">"*"</span>
  <a href="#ExtSet_45_34" id="ExtSet_58_3" title="Referenced at line 45, 46, 47, 48, 49, 52, 71, 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtNone_58_10" title="Not referenced">ExtNone</span></span>  = <span class="cons_Lit">"0"</span>


  <a href="#ExtId_54_23" id="ExtId_61_3" title="Referenced at line 54, 55">ExtId</a>.<span class="cons_Constructor"><span id="ExtRef_61_9" title="Not referenced">ExtRef</span></span>  = &lt;<span class="cons_String">ref</span> &lt;<span title="External reference">NaBL2Occurrence</span>&gt;&gt;
  <a href="#ExtId_54_23" id="ExtId_62_3" title="Referenced at line 54, 55">ExtId</a>.<span class="cons_Constructor"><span id="ExtDecl_62_9" title="Not referenced">ExtDecl</span></span> = &lt;<span class="cons_String">decl</span> &lt;<span title="External reference">NaBL2Occurrence</span>&gt;&gt;


  <a href="#ExtLabel_56_25" id="ExtLabel_65_3" title="Referenced at line 56">ExtLabel</a> = <a href="../Core.sdf3/#RelRef_165_3" id="RelRef_65_14" title="Defined at ../Core.sdf3 line 165">RelRef</a>
  <a href="#ExtLabel_56_25" id="ExtLabel_66_3" title="Referenced at line 56">ExtLabel</a> = <a href="../Core.sdf3/#EdgeRef_198_3" id="EdgeRef_66_14" title="Defined at ../Core.sdf3 line 198, 199">EdgeRef</a>


  <span id="ExtEqs_69_3" title="Not referenced">ExtEqs</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtEq_71_3" id="ExtEq_69_17" title="Defined at line 71">ExtEq</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#ExtEq_69_17" id="ExtEq_71_3" title="Referenced at line 69">ExtEq</a> = [[<a href="#ExtSet_54_3" id="ExtSet_71_13" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">:=</span> [<a href="#ExtOp_74_3" id="ExtOp_71_25" title="Defined at line 74, 75, 76">ExtOp</a>]]


  <a href="#ExtOp_71_25" id="ExtOp_74_3" title="Referenced at line 71, 74, 75">ExtOp</a>.<span class="cons_Constructor"><span id="Union_74_9" title="Not referenced">Union</span></span>        = [<span class="cons_String">union(</span>[{<a href="#ExtOp_74_3" id="ExtOp_74_33" title="Defined at line 74, 75, 76">ExtOp</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#ExtOp_71_25" id="ExtOp_75_3" title="Referenced at line 71, 74, 75">ExtOp</a>.<span class="cons_Constructor"><span id="Intersection_75_9" title="Not referenced">Intersection</span></span> = [<span class="cons_String">isect(</span>[{<a href="#ExtOp_74_3" id="ExtOp_75_33" title="Defined at line 74, 75, 76">ExtOp</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#ExtOp_71_25" id="ExtOp_76_3" title="Referenced at line 71, 74, 75">ExtOp</a>              = <a href="#ExtSet_54_3" id="ExtSet_76_24" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>

<span class="keyword">context-free syntax</span>

  <span id="PatternConstraint_80_3" title="Not referenced">PatternConstraint</span>.<span class="cons_Constructor"><span id="DistinctPatterns_80_21" title="Not referenced">DistinctPatterns</span></span> = &lt;<span class="cons_String">distinct</span> <span class="cons_String">patterns</span> &lt;{<span title="External reference">NaBL2Occurrence</span> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <span id="PatternConstraint_81_3" title="Not referenced">PatternConstraint</span>.<span class="cons_Constructor"><span id="NoDuplicatePatterns_81_21" title="Not referenced">NoDuplicatePatterns</span></span> = &lt;<span class="cons_String">patterns</span> <span class="cons_String">{</span>&lt;{<span title="External reference">NaBL2Occurrence</span> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span> <span class="cons_String">do</span> <span class="cons_String">not</span> <span class="cons_String">duplicate</span> <span class="cons_String">{</span>&lt;{<span title="External reference">NaBL2Occurrence</span> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span> &lt;<a href="#ExtOrigin_39_3" id="ExtOrigin_81_127" title="Defined at line 39">ExtOrigin</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
