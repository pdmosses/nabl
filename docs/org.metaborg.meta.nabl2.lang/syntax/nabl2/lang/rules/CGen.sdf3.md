---
title: CGen.sdf3
hide:
  - toc
---

# `CGen.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/CGen.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/CGen.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/CGen.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Rules.sdf3/#nabl2/lang/rules/CGen_42_63" id="nabl2/lang/rules/CGen_7_28" title="Referenced at ../Rules.sdf3 line 5; ../../signatures/CGen.sdf3 line 7">nabl2/lang/rules/CGen</a>

<span class="keyword">imports</span>
 
  <span title="External reference">nabl2/shared/common/CTerms</span>
  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/constraints/Base</span>

  <a href="../../common/Identifiers.sdf3/#nabl2/lang/common/Identifiers_7_36" id="nabl2/lang/common/Identifiers_138_167" title="Defined at ../../common/Identifiers.sdf3 line 1">nabl2/lang/common/Identifiers</a>
  <a href="../../common/Injections.sdf3/#nabl2/lang/common/Injections_7_35" id="nabl2/lang/common/Injections_170_198" title="Defined at ../../common/Injections.sdf3 line 1">nabl2/lang/common/Injections</a>
  <a href="../../common/Terms.sdf3/#nabl2/lang/common/Terms_7_30" id="nabl2/lang/common/Terms_201_224" title="Defined at ../../common/Terms.sdf3 line 1">nabl2/lang/common/Terms</a>
  <a href="../Rules.sdf3/#nabl2/lang/rules/Rules_7_29" id="nabl2/lang/rules/Rules_227_249" title="Defined at ../Rules.sdf3 line 1">nabl2/lang/rules/Rules</a>
  <a href="../Names.sdf3/#nabl2/lang/rules/Names_7_29" id="nabl2/lang/rules/Names_252_274" title="Defined at ../Names.sdf3 line 1">nabl2/lang/rules/Names</a>


<span class="keyword">context-free syntax</span>

  <a href="../Rules.sdf3/#NaBL2-Rule_210_220" id="NaBL2-Rule_300_310" title="Referenced at ../Rules.sdf3 line 17">NaBL2-Rule</a>.<span class="cons_Constructor"><span id="CGenInitRuleNoConstraint_311_335" title="Not referenced locally, nor via imports">CGenInitRuleNoConstraint</span></span> = &lt;
    <span class="cons_String">init</span> &lt;<a href="#NaBL2-CGenParamsTerm_1000_1020" id="NaBL2-CGenParamsTerm_350_370" title="Defined at line 43, 44">NaBL2-CGenParamsTerm</a>&gt; &lt;<a href="#NaBL2-CGenTypeTerm_1294_1312" id="NaBL2-CGenTypeTerm_373_391" title="Defined at line 49, 50">NaBL2-CGenTypeTerm</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="../Rules.sdf3/#NaBL2-Rule_210_220" id="NaBL2-Rule_401_411" title="Referenced at ../Rules.sdf3 line 17">NaBL2-Rule</a>.<span class="cons_Constructor"><span id="CGenInitRule_412_424" title="Not referenced locally, nor via imports">CGenInitRule</span></span> = &lt;
    <span class="cons_String">init</span> &lt;<a href="#NaBL2-CGenParamsTerm_1000_1020" id="NaBL2-CGenParamsTerm_439_459" title="Defined at line 43, 44">NaBL2-CGenParamsTerm</a>&gt; &lt;<a href="#NaBL2-CGenTypeTerm_1294_1312" id="NaBL2-CGenTypeTerm_462_480" title="Defined at line 49, 50">NaBL2-CGenTypeTerm</a>&gt; <span class="cons_String">:=</span>
        &lt;<a href="#NaBL2-RuleBody_815_829" id="NaBL2-RuleBody_494_508" title="Defined at line 36">NaBL2-RuleBody</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="../Rules.sdf3/#NaBL2-Rule_210_220" id="NaBL2-Rule_518_528" title="Referenced at ../Rules.sdf3 line 17">NaBL2-Rule</a>.<span class="cons_Constructor"><span id="CGenRuleNoConstraint_529_549" title="Not referenced locally, nor via imports">CGenRuleNoConstraint</span></span> = &lt;
    &lt;<a href="../Names.sdf3/#NaBL2-CGenRuleDef_164_181" id="NaBL2-CGenRuleDef_559_576" title="Defined at ../Names.sdf3 line 14, 15, 16, 17">NaBL2-CGenRuleDef</a>&gt; <span class="cons_String">[[</span> &lt;<a href="../../common/Terms.sdf3/#NaBL2-Pattern_264_277" id="NaBL2-Pattern_582_595" title="Defined at ../../common/Terms.sdf3 line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a>&gt; &lt;<a href="#NaBL2-CGenParamsPattern_1144_1167" id="NaBL2-CGenParamsPattern_598_621" title="Defined at line 46, 47">NaBL2-CGenParamsPattern</a>&gt; &lt;<a href="#NaBL2-CGenTypePattern_1381_1402" id="NaBL2-CGenTypePattern_624_645" title="Defined at line 52, 53">NaBL2-CGenTypePattern</a>&gt; <span class="cons_String">]]</span> <span class="cons_String">.</span>
  &gt;

  <a href="../Rules.sdf3/#NaBL2-Rule_210_220" id="NaBL2-Rule_659_669" title="Referenced at ../Rules.sdf3 line 17">NaBL2-Rule</a>.<span class="cons_Constructor"><span id="CGenRule_670_678" title="Not referenced locally, nor via imports">CGenRule</span></span> = &lt;
    &lt;<a href="../Names.sdf3/#NaBL2-CGenRuleDef_164_181" id="NaBL2-CGenRuleDef_688_705" title="Defined at ../Names.sdf3 line 14, 15, 16, 17">NaBL2-CGenRuleDef</a>&gt; <span class="cons_String">[[</span> &lt;<a href="../../common/Terms.sdf3/#NaBL2-Pattern_264_277" id="NaBL2-Pattern_711_724" title="Defined at ../../common/Terms.sdf3 line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a>&gt; &lt;<a href="#NaBL2-CGenParamsPattern_1144_1167" id="NaBL2-CGenParamsPattern_727_750" title="Defined at line 46, 47">NaBL2-CGenParamsPattern</a>&gt; &lt;<a href="#NaBL2-CGenTypePattern_1381_1402" id="NaBL2-CGenTypePattern_753_774" title="Defined at line 52, 53">NaBL2-CGenTypePattern</a>&gt; <span class="cons_String">]]</span> <span class="cons_String">:=</span>
        &lt;<a href="#NaBL2-RuleBody_815_829" id="NaBL2-RuleBody_791_805" title="Defined at line 36">NaBL2-RuleBody</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="#NaBL2-RuleBody_494_508" id="NaBL2-RuleBody_815_829" title="Referenced at line 24, 33">NaBL2-RuleBody</a>       = <a href="#NaBL2-Constraint_858_874" id="NaBL2-Constraint_838_854" title="Defined at line 38">NaBL2-Constraint</a>

  <a href="#NaBL2-Constraint_838_854" id="NaBL2-Constraint_858_874" title="Referenced at line 36">NaBL2-Constraint</a>.<span class="cons_Constructor"><span id="CGenRecurse_875_886" title="Not referenced locally, nor via imports">CGenRecurse</span></span> = &lt;&lt;<a href="../Names.sdf3/#NaBL2-CGenRuleRefTop_403_423" id="NaBL2-CGenRuleRefTop_891_911" title="Defined at ../Names.sdf3 line 20, 21, 22">NaBL2-CGenRuleRefTop</a>&gt;<span class="cons_String">[[</span> &lt;<a href="../../common/Terms.sdf3/#NaBL2-Var_146_155" id="NaBL2-Var_916_925" title="Defined at ../../common/Terms.sdf3 line 13">NaBL2-Var</a>&gt; &lt;<a href="#NaBL2-CGenParamsTerm_1000_1020" id="NaBL2-CGenParamsTerm_928_948" title="Defined at line 43, 44">NaBL2-CGenParamsTerm</a>&gt; &lt;<a href="#NaBL2-CGenTypeTerm_1294_1312" id="NaBL2-CGenTypeTerm_951_969" title="Defined at line 49, 50">NaBL2-CGenTypeTerm</a>&gt; <span class="cons_String">]]</span>&gt;


<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-CGenParamsTerm_350_370" id="NaBL2-CGenParamsTerm_1000_1020" title="Referenced at line 19, 23, 38">NaBL2-CGenParamsTerm</a>          =                             {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"Tuple([])"</span>)}
  <a href="#NaBL2-CGenParamsTerm_350_370" id="NaBL2-CGenParamsTerm_1081_1101" title="Referenced at line 19, 23, 38">NaBL2-CGenParamsTerm</a>.<span class="cons_Constructor"><span id="Tuple_1102_1107" title="Not referenced locally, nor via imports">Tuple</span></span>    = &lt;<span class="cons_String">^</span> <span class="cons_String">(</span>&lt;{<span title="External reference">NaBL2-CTerm</span> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#NaBL2-CGenParamsPattern_598_621" id="NaBL2-CGenParamsPattern_1144_1167" title="Referenced at line 28, 32">NaBL2-CGenParamsPattern</a>       =                                {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"Tuple([])"</span>)}
  <a href="#NaBL2-CGenParamsPattern_598_621" id="NaBL2-CGenParamsPattern_1228_1251" title="Referenced at line 28, 32">NaBL2-CGenParamsPattern</a>.<span class="cons_Constructor"><span id="Tuple_1252_1257" title="Not referenced locally, nor via imports">Tuple</span></span> = &lt;<span class="cons_String">^</span> <span class="cons_String">(</span>&lt;{<a href="../../common/Terms.sdf3/#NaBL2-VarOrWld_203_217" id="NaBL2-VarOrWld_1266_1280" title="Defined at ../../common/Terms.sdf3 line 16, 17">NaBL2-VarOrWld</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#NaBL2-CGenTypeTerm_373_391" id="NaBL2-CGenTypeTerm_1294_1312" title="Referenced at line 19, 23, 38">NaBL2-CGenTypeTerm</a>.<span class="cons_Constructor"><span id="NoType_1313_1319" title="Not referenced locally, nor via imports">NoType</span></span>     =
  <a href="#NaBL2-CGenTypeTerm_373_391" id="NaBL2-CGenTypeTerm_1328_1346" title="Referenced at line 19, 23, 38">NaBL2-CGenTypeTerm</a>.<span class="cons_Constructor"><span id="Type_1347_1351" title="Not referenced locally, nor via imports">Type</span></span>       = &lt;<span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-CTerm</span>&gt;&gt;

  <a href="#NaBL2-CGenTypePattern_624_645" id="NaBL2-CGenTypePattern_1381_1402" title="Referenced at line 28, 32">NaBL2-CGenTypePattern</a>.<span class="cons_Constructor"><span id="NoType_1403_1409" title="Not referenced locally, nor via imports">NoType</span></span>  =
  <a href="#NaBL2-CGenTypePattern_624_645" id="NaBL2-CGenTypePattern_1415_1436" title="Referenced at line 28, 32">NaBL2-CGenTypePattern</a>.<span class="cons_Constructor"><span id="Type_1437_1441" title="Not referenced locally, nor via imports">Type</span></span>    = &lt;<span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-CTerm</span>&gt;&gt;


</code></pre></td></tr></tbody></table></div>