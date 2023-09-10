---
title: Type.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/lang/Type_7_23" title="Not referenced locally, nor via imports">statix/lang/Type</span>

<span class="keyword">imports</span>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3#nabl2/API_7_16" id="nabl2/API_36_45" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3 line 1">nabl2/API</a>

  <a href="../Common.sdf3#statix/lang/Common_7_25" id="statix/lang/Common_49_67" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3#statix/lang/Core_7_23" id="statix/lang/Core_70_86" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3#statix/API_7_17" id="statix/API_90_100" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3 line 1">statix/API</a>

<span class="keyword">sorts</span>

  <span id="IType_111_116" title="Not referenced locally, nor via imports">IType</span> <span class="layout">// internal type</span>
  <a href="#TType_606_611" id="TType_136_141" title="Referenced at line 34">TType</a> <span class="layout">// term type</span>

<span class="keyword">context-free syntax</span>

  <span id="IType_179_184" title="Not referenced locally, nor via imports">IType</span>.<span class="cons_Constructor"><span id="PRED_185_189" title="Not referenced locally, nor via imports">PRED</span></span> = [[<a href="#TTypes_306_312" id="TTypes_194_200" title="Defined at line 24">TTypes</a>]]
  <span id="IType_205_210" title="Not referenced locally, nor via imports">IType</span>.<span class="cons_Constructor"><span id="FUN_211_214" title="Not referenced locally, nor via imports">FUN</span></span>  = [[<a href="#TTypes_306_312" id="TTypes_220_226" title="Defined at line 24">TTypes</a>] <span class="cons_String">-&gt;</span> [<a href="#TType_136_141" id="TType_232_237" title="Defined at line 15, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35">TType</a>]]
  <span id="IType_242_247" title="Not referenced locally, nor via imports">IType</span>.<span class="cons_Constructor"><span id="NS_248_250" title="Not referenced locally, nor via imports">NS</span></span>   = [[<a href="#TTypes_306_312" id="TTypes_257_263" title="Defined at line 24">TTypes</a>]]
  <span id="IType_268_273" title="Not referenced locally, nor via imports">IType</span>.<span class="cons_Constructor"><span id="OP_274_276" title="Not referenced locally, nor via imports">OP</span></span>   = [[<a href="#TTypes_306_312" id="TTypes_283_289" title="Defined at line 24">TTypes</a>] <span class="cons_String">-&gt;</span> [<a href="#TType_136_141" id="TType_295_300" title="Defined at line 15, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35">TType</a>]]

  <a href="#TTypes_639_645" id="TTypes_306_312" title="Referenced at line 35">TTypes</a> = {<a href="#TType_136_141" id="TType_316_321" title="Defined at line 15, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35">TType</a> <span class="cons_Lit">" * "</span>}*

  <a href="#TType_606_611" id="TType_333_338" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="SORT_339_343" title="Not referenced locally, nor via imports">SORT</span></span>       = &lt;&lt;<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3#NaBL2Occurrence_83_98" id="NaBL2Occurrence_354_369" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3 line 10">NaBL2Occurrence</a>&gt;&gt;
  <a href="#TType_606_611" id="TType_374_379" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="INT_380_383" title="Not referenced locally, nor via imports">INT</span></span>        = &lt;<span class="cons_String">int</span>&gt;
  <a href="#TType_606_611" id="TType_401_406" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="STRING_407_413" title="Not referenced locally, nor via imports">STRING</span></span>     = &lt;<span class="cons_String">string</span>&gt;
  <a href="#TType_606_611" id="TType_431_436" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="PATH_437_441" title="Not referenced locally, nor via imports">PATH</span></span>       = &lt;<span class="cons_String">path</span>&gt;
  <a href="#TType_606_611" id="TType_459_464" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="LABEL_465_470" title="Not referenced locally, nor via imports">LABEL</span></span>      = &lt;<span class="cons_String">label</span>&gt;
  <a href="#TType_606_611" id="TType_488_493" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="OCCURRENCE_494_504" title="Not referenced locally, nor via imports">OCCURRENCE</span></span> = &lt;<span class="cons_String">occurrence</span>&gt;
  <a href="#TType_606_611" id="TType_522_527" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="AST_ID_528_534" title="Not referenced locally, nor via imports">AST_ID</span></span>     = &lt;<span class="cons_String">astId</span>&gt;
  <a href="#TType_606_611" id="TType_551_556" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="SCOPE_557_562" title="Not referenced locally, nor via imports">SCOPE</span></span>      = &lt;<span class="cons_String">scope</span>&gt;
  <a href="#TType_606_611" id="TType_580_585" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="LIST_586_590" title="Not referenced locally, nor via imports">LIST</span></span>       = &lt;<span class="cons_String">list(</span>&lt;<a href="#TType_136_141" id="TType_606_611" title="Defined at line 15, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35">TType</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#TType_606_611" id="TType_617_622" title="Referenced at line 34">TType</a>.<span class="cons_Constructor"><span id="TUPLE_623_628" title="Not referenced locally, nor via imports">TUPLE</span></span>      = &lt;<span class="cons_String">(</span>&lt;<a href="#TTypes_306_312" id="TTypes_639_645" title="Defined at line 24">TTypes</a>&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">sorts</span>

  <a href="#ExtOrigin_1882_1891" id="ExtOrigin_659_668" title="Referenced at line 81">ExtOrigin</a> <span class="layout">// custom prettyprint rule in statix/lang/scope-extension.str</span>

<span class="keyword">context-free syntax</span>

  <span id="ExtConstraints_755_769" title="Not referenced locally, nor via imports">ExtConstraints</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtConstraint_803_816" id="ExtConstraint_777_790" title="Defined at line 45, 46, 47, 48, 49">ExtConstraint</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#ExtConstraint_777_790" id="ExtConstraint_803_816" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtProvides_817_828" title="Not referenced locally, nor via imports">ExtProvides</span></span>  = [[<a href="#ExtSet_1166_1172" id="ExtSet_834_840" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">!</span> [<a href="#ExtSet_1166_1172" id="ExtSet_845_851" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>][<a href="#ExtOrigin_659_668" id="ExtOrigin_853_862" title="Defined at line 39">ExtOrigin</a>]]
  <a href="#ExtConstraint_777_790" id="ExtConstraint_867_880" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtRequires_881_892" title="Not referenced locally, nor via imports">ExtRequires</span></span>  = [[<a href="#ExtSet_1166_1172" id="ExtSet_898_904" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">?</span> [<a href="#ExtSet_1166_1172" id="ExtSet_909_915" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>][<a href="#ExtOrigin_659_668" id="ExtOrigin_917_926" title="Defined at line 39">ExtOrigin</a>]]
  <a href="#ExtConstraint_777_790" id="ExtConstraint_931_944" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtIsCovered_945_957" title="Not referenced locally, nor via imports">ExtIsCovered</span></span> = [[<a href="#ExtSet_1166_1172" id="ExtSet_962_968" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">is</span> <span class="cons_String">closed</span>[<a href="#ExtOrigin_659_668" id="ExtOrigin_980_989" title="Defined at line 39">ExtOrigin</a>]]
  <a href="#ExtConstraint_777_790" id="ExtConstraint_994_1007" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtProvidesEsc_1008_1022" title="Not referenced locally, nor via imports">ExtProvidesEsc</span></span>  = [[<a href="#ExtSet_1166_1172" id="ExtSet_1028_1034" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">^!</span> [<a href="#ExtSet_1166_1172" id="ExtSet_1040_1046" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>][<a href="#ExtOrigin_659_668" id="ExtOrigin_1048_1057" title="Defined at line 39">ExtOrigin</a>]]
  <a href="#ExtConstraint_777_790" id="ExtConstraint_1062_1075" title="Referenced at line 43">ExtConstraint</a>.<span class="cons_Constructor"><span id="ExtRequiresEsc_1076_1090" title="Not referenced locally, nor via imports">ExtRequiresEsc</span></span>  = [[<a href="#ExtSet_1166_1172" id="ExtSet_1096_1102" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">^?</span> [<a href="#ExtSet_1166_1172" id="ExtSet_1108_1114" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>][<a href="#ExtOrigin_659_668" id="ExtOrigin_1116_1125" title="Defined at line 39">ExtOrigin</a>]]


  <span id="ExtSets_1132_1139" title="Not referenced locally, nor via imports">ExtSets</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtSet_1166_1172" id="ExtSet_1147_1153" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#ExtSet_1642_1648" id="ExtSet_1166_1172" title="Referenced at line 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtParam_1173_1181" title="Not referenced locally, nor via imports">ExtParam</span></span> = [[<a href="#ExtId_1329_1334" id="ExtId_1186_1191" title="Defined at line 61, 62">ExtId</a>]<span class="cons_String">.</span>[<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3#Stx-INT_42_49" id="Stx-INT_1194_1201" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3 line 5">Stx-INT</a>]]
  <a href="#ExtSet_1642_1648" id="ExtSet_1206_1212" title="Referenced at line 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtVar_1213_1219" title="Not referenced locally, nor via imports">ExtVar</span></span>   = [[<a href="#ExtId_1329_1334" id="ExtId_1226_1231" title="Defined at line 61, 62">ExtId</a>]]
  <a href="#ExtSet_1642_1648" id="ExtSet_1236_1242" title="Referenced at line 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtLit_1243_1249" title="Not referenced locally, nor via imports">ExtLit</span></span>   = [<span class="cons_String">{</span>[{<a href="#ExtLabel_1416_1424" id="ExtLabel_1258_1266" title="Defined at line 65, 66">ExtLabel</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">}</span>]
  <a href="#ExtSet_1642_1648" id="ExtSet_1279_1285" title="Referenced at line 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtAll_1286_1292" title="Not referenced locally, nor via imports">ExtAll</span></span>   = <span class="cons_Lit">"*"</span>
  <a href="#ExtSet_1642_1648" id="ExtSet_1303_1309" title="Referenced at line 76">ExtSet</a>.<span class="cons_Constructor"><span id="ExtNone_1310_1317" title="Not referenced locally, nor via imports">ExtNone</span></span>  = <span class="cons_Lit">"0"</span>


  <a href="#ExtId_1226_1231" id="ExtId_1329_1334" title="Referenced at line 55">ExtId</a>.<span class="cons_Constructor"><span id="ExtRef_1335_1341" title="Not referenced locally, nor via imports">ExtRef</span></span>  = &lt;<span class="cons_String">ref</span> &lt;<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3#NaBL2Occurrence_83_98" id="NaBL2Occurrence_1351_1366" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3 line 10">NaBL2Occurrence</a>&gt;&gt;
  <a href="#ExtId_1226_1231" id="ExtId_1371_1376" title="Referenced at line 55">ExtId</a>.<span class="cons_Constructor"><span id="ExtDecl_1377_1384" title="Not referenced locally, nor via imports">ExtDecl</span></span> = &lt;<span class="cons_String">decl</span> &lt;<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3#NaBL2Occurrence_83_98" id="NaBL2Occurrence_1394_1409" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3 line 10">NaBL2Occurrence</a>&gt;&gt;


  <a href="#ExtLabel_1258_1266" id="ExtLabel_1416_1424" title="Referenced at line 56">ExtLabel</a> = <a href="../Core.sdf3#RelRef_3522_3528" id="RelRef_1427_1433" title="Defined at ../Core.sdf3 line 165">RelRef</a>
  <a href="#ExtLabel_1258_1266" id="ExtLabel_1436_1444" title="Referenced at line 56">ExtLabel</a> = <a href="../Core.sdf3#EdgeRef_4215_4222" id="EdgeRef_1447_1454" title="Defined at ../Core.sdf3 line 198, 199">EdgeRef</a>


  <span id="ExtEqs_1459_1465" title="Not referenced locally, nor via imports">ExtEqs</span> = &lt;<span class="cons_String">|</span> &lt;{<a href="#ExtEq_1491_1496" id="ExtEq_1473_1478" title="Defined at line 71">ExtEq</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#ExtEq_1473_1478" id="ExtEq_1491_1496" title="Referenced at line 69">ExtEq</a> = [[<a href="#ExtSet_1166_1172" id="ExtSet_1501_1507" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>] <span class="cons_String">:=</span> [<a href="#ExtOp_1525_1530" id="ExtOp_1513_1518" title="Defined at line 74, 75, 76">ExtOp</a>]]


  <a href="#ExtOp_1603_1608" id="ExtOp_1525_1530" title="Referenced at line 75">ExtOp</a>.<span class="cons_Constructor"><span id="Union_1531_1536" title="Not referenced locally, nor via imports">Union</span></span>        = [<span class="cons_String">union(</span>[{<a href="#ExtOp_1525_1530" id="ExtOp_1555_1560" title="Defined at line 74, 75, 76">ExtOp</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#ExtOp_1603_1608" id="ExtOp_1573_1578" title="Referenced at line 75">ExtOp</a>.<span class="cons_Constructor"><span id="Intersection_1579_1591" title="Not referenced locally, nor via imports">Intersection</span></span> = [<span class="cons_String">isect(</span>[{<a href="#ExtOp_1525_1530" id="ExtOp_1603_1608" title="Defined at line 74, 75, 76">ExtOp</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#ExtOp_1603_1608" id="ExtOp_1621_1626" title="Referenced at line 75">ExtOp</a>              = <a href="#ExtSet_1166_1172" id="ExtSet_1642_1648" title="Defined at line 54, 55, 56, 57, 58">ExtSet</a>

<span class="keyword">context-free syntax</span>

  <span id="PatternConstraint_1673_1690" title="Not referenced locally, nor via imports">PatternConstraint</span>.<span class="cons_Constructor"><span id="DistinctPatterns_1691_1707" title="Not referenced locally, nor via imports">DistinctPatterns</span></span> = &lt;<span class="cons_String">distinct</span> <span class="cons_String">patterns</span> &lt;{<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3#NaBL2Occurrence_83_98" id="NaBL2Occurrence_1731_1746" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3 line 10">NaBL2Occurrence</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <span id="PatternConstraint_1758_1775" title="Not referenced locally, nor via imports">PatternConstraint</span>.<span class="cons_Constructor"><span id="NoDuplicatePatterns_1776_1795" title="Not referenced locally, nor via imports">NoDuplicatePatterns</span></span> = &lt;<span class="cons_String">patterns</span> <span class="cons_String">{</span>&lt;{<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3#NaBL2Occurrence_83_98" id="NaBL2Occurrence_1811_1826" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3 line 10">NaBL2Occurrence</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span> <span class="cons_String">do</span> <span class="cons_String">not</span> <span class="cons_String">duplicate</span> <span class="cons_String">{</span>&lt;{<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3#NaBL2Occurrence_83_98" id="NaBL2Occurrence_1856_1871" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/API.sdf3 line 10">NaBL2Occurrence</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span> &lt;<a href="#ExtOrigin_659_668" id="ExtOrigin_1882_1891" title="Defined at line 39">ExtOrigin</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>