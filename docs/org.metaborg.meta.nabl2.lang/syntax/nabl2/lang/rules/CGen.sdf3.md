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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/rules/CGen_1_8" title="Multi-file references" data-urls="../Rules.sdf3/#nabl2/lang/rules/CGen_5_3 line 5; ../../signatures/CGen.sdf3/#nabl2/lang/rules/CGen_7_3 line 7">nabl2/lang/rules/CGen</button>

<span class="keyword">imports</span>
 
  <span title="External reference">nabl2/shared/common/CTerms</span>
  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/constraints/Base</span>

  <a href="../../common/Identifiers.sdf3/#nabl2/lang/common/Identifiers_1_8" id="nabl2/lang/common/Identifiers_9_3" title="Defined at ../../common/Identifiers.sdf3 line 1">nabl2/lang/common/Identifiers</a>
  <a href="../../common/Injections.sdf3/#nabl2/lang/common/Injections_1_8" id="nabl2/lang/common/Injections_10_3" title="Defined at ../../common/Injections.sdf3 line 1">nabl2/lang/common/Injections</a>
  <a href="../../common/Terms.sdf3/#nabl2/lang/common/Terms_1_8" id="nabl2/lang/common/Terms_11_3" title="Defined at ../../common/Terms.sdf3 line 1">nabl2/lang/common/Terms</a>
  <a href="../Rules.sdf3/#nabl2/lang/rules/Rules_1_8" id="nabl2/lang/rules/Rules_12_3" title="Defined at ../Rules.sdf3 line 1">nabl2/lang/rules/Rules</a>
  <a href="../Names.sdf3/#nabl2/lang/rules/Names_1_8" id="nabl2/lang/rules/Names_13_3" title="Defined at ../Names.sdf3 line 1">nabl2/lang/rules/Names</a>


<span class="keyword">context-free syntax</span>

  <a href="../Rules.sdf3/#NaBL2-Rule_17_9" id="NaBL2-Rule_18_3" title="Referenced at ../Rules.sdf3 line 17">NaBL2-Rule</a>.<span class="cons_Constructor"><span id="CGenInitRuleNoConstraint_18_14" title="Not referenced">CGenInitRuleNoConstraint</span></span> = &lt;
    <span class="cons_String">init</span> &lt;<a href="#NaBL2-CGenParamsTerm_43_3" id="NaBL2-CGenParamsTerm_19_11" title="Defined at line 43, 44">NaBL2-CGenParamsTerm</a>&gt; &lt;<a href="#NaBL2-CGenTypeTerm_49_3" id="NaBL2-CGenTypeTerm_19_34" title="Defined at line 49, 50">NaBL2-CGenTypeTerm</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="../Rules.sdf3/#NaBL2-Rule_17_9" id="NaBL2-Rule_22_3" title="Referenced at ../Rules.sdf3 line 17">NaBL2-Rule</a>.<span class="cons_Constructor"><span id="CGenInitRule_22_14" title="Not referenced">CGenInitRule</span></span> = &lt;
    <span class="cons_String">init</span> &lt;<a href="#NaBL2-CGenParamsTerm_43_3" id="NaBL2-CGenParamsTerm_23_11" title="Defined at line 43, 44">NaBL2-CGenParamsTerm</a>&gt; &lt;<a href="#NaBL2-CGenTypeTerm_49_3" id="NaBL2-CGenTypeTerm_23_34" title="Defined at line 49, 50">NaBL2-CGenTypeTerm</a>&gt; <span class="cons_String">:=</span>
        &lt;<a href="#NaBL2-RuleBody_36_3" id="NaBL2-RuleBody_24_10" title="Defined at line 36">NaBL2-RuleBody</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="../Rules.sdf3/#NaBL2-Rule_17_9" id="NaBL2-Rule_27_3" title="Referenced at ../Rules.sdf3 line 17">NaBL2-Rule</a>.<span class="cons_Constructor"><span id="CGenRuleNoConstraint_27_14" title="Not referenced">CGenRuleNoConstraint</span></span> = &lt;
    &lt;<a href="../Names.sdf3/#NaBL2-CGenRuleDef_14_3" id="NaBL2-CGenRuleDef_28_6" title="Defined at ../Names.sdf3 line 14, 15, 16, 17">NaBL2-CGenRuleDef</a>&gt; <span class="cons_String">[[</span> &lt;<a href="../../common/Terms.sdf3/#NaBL2-Pattern_19_3" id="NaBL2-Pattern_28_29" title="Defined at ../../common/Terms.sdf3 line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a>&gt; &lt;<a href="#NaBL2-CGenParamsPattern_46_3" id="NaBL2-CGenParamsPattern_28_45" title="Defined at line 46, 47">NaBL2-CGenParamsPattern</a>&gt; &lt;<a href="#NaBL2-CGenTypePattern_52_3" id="NaBL2-CGenTypePattern_28_71" title="Defined at line 52, 53">NaBL2-CGenTypePattern</a>&gt; <span class="cons_String">]]</span> <span class="cons_String">.</span>
  &gt;

  <a href="../Rules.sdf3/#NaBL2-Rule_17_9" id="NaBL2-Rule_31_3" title="Referenced at ../Rules.sdf3 line 17">NaBL2-Rule</a>.<span class="cons_Constructor"><span id="CGenRule_31_14" title="Not referenced">CGenRule</span></span> = &lt;
    &lt;<a href="../Names.sdf3/#NaBL2-CGenRuleDef_14_3" id="NaBL2-CGenRuleDef_32_6" title="Defined at ../Names.sdf3 line 14, 15, 16, 17">NaBL2-CGenRuleDef</a>&gt; <span class="cons_String">[[</span> &lt;<a href="../../common/Terms.sdf3/#NaBL2-Pattern_19_3" id="NaBL2-Pattern_32_29" title="Defined at ../../common/Terms.sdf3 line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a>&gt; &lt;<a href="#NaBL2-CGenParamsPattern_46_3" id="NaBL2-CGenParamsPattern_32_45" title="Defined at line 46, 47">NaBL2-CGenParamsPattern</a>&gt; &lt;<a href="#NaBL2-CGenTypePattern_52_3" id="NaBL2-CGenTypePattern_32_71" title="Defined at line 52, 53">NaBL2-CGenTypePattern</a>&gt; <span class="cons_String">]]</span> <span class="cons_String">:=</span>
        &lt;<a href="#NaBL2-RuleBody_36_3" id="NaBL2-RuleBody_33_10" title="Defined at line 36">NaBL2-RuleBody</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="#NaBL2-RuleBody_24_10" id="NaBL2-RuleBody_36_3" title="Referenced at line 24, 33">NaBL2-RuleBody</a>       = <a href="#NaBL2-Constraint_38_3" id="NaBL2-Constraint_36_26" title="Defined at line 38">NaBL2-Constraint</a>

  <a href="#NaBL2-Constraint_36_26" id="NaBL2-Constraint_38_3" title="Referenced at line 36">NaBL2-Constraint</a>.<span class="cons_Constructor"><span id="CGenRecurse_38_20" title="Not referenced">CGenRecurse</span></span> = &lt;&lt;<a href="../Names.sdf3/#NaBL2-CGenRuleRefTop_20_3" id="NaBL2-CGenRuleRefTop_38_36" title="Defined at ../Names.sdf3 line 20, 21, 22">NaBL2-CGenRuleRefTop</a>&gt;<span class="cons_String">[[</span> &lt;<a href="../../common/Terms.sdf3/#NaBL2-Var_13_3" id="NaBL2-Var_38_61" title="Defined at ../../common/Terms.sdf3 line 13">NaBL2-Var</a>&gt; &lt;<a href="#NaBL2-CGenParamsTerm_43_3" id="NaBL2-CGenParamsTerm_38_73" title="Defined at line 43, 44">NaBL2-CGenParamsTerm</a>&gt; &lt;<a href="#NaBL2-CGenTypeTerm_49_3" id="NaBL2-CGenTypeTerm_38_96" title="Defined at line 49, 50">NaBL2-CGenTypeTerm</a>&gt; <span class="cons_String">]]</span>&gt;


<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-CGenParamsTerm_19_11" id="NaBL2-CGenParamsTerm_43_3" title="Referenced at line 19, 23, 38">NaBL2-CGenParamsTerm</a>          =                             {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"Tuple([])"</span>)}
  <a href="#NaBL2-CGenParamsTerm_19_11" id="NaBL2-CGenParamsTerm_44_3" title="Referenced at line 19, 23, 38">NaBL2-CGenParamsTerm</a>.<span class="cons_Constructor"><span id="Tuple_44_24" title="Not referenced">Tuple</span></span>    = &lt;<span class="cons_String">^</span> <span class="cons_String">(</span>&lt;{<span title="External reference">NaBL2-CTerm</span> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#NaBL2-CGenParamsPattern_28_45" id="NaBL2-CGenParamsPattern_46_3" title="Referenced at line 28, 32">NaBL2-CGenParamsPattern</a>       =                                {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"Tuple([])"</span>)}
  <a href="#NaBL2-CGenParamsPattern_28_45" id="NaBL2-CGenParamsPattern_47_3" title="Referenced at line 28, 32">NaBL2-CGenParamsPattern</a>.<span class="cons_Constructor"><span id="Tuple_47_27" title="Not referenced">Tuple</span></span> = &lt;<span class="cons_String">^</span> <span class="cons_String">(</span>&lt;{<a href="../../common/Terms.sdf3/#NaBL2-VarOrWld_16_3" id="NaBL2-VarOrWld_47_41" title="Defined at ../../common/Terms.sdf3 line 16, 17">NaBL2-VarOrWld</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#NaBL2-CGenTypeTerm_19_34" id="NaBL2-CGenTypeTerm_49_3" title="Referenced at line 19, 23, 38">NaBL2-CGenTypeTerm</a>.<span class="cons_Constructor"><span id="NoType_49_22" title="Not referenced">NoType</span></span>     =
  <a href="#NaBL2-CGenTypeTerm_19_34" id="NaBL2-CGenTypeTerm_50_3" title="Referenced at line 19, 23, 38">NaBL2-CGenTypeTerm</a>.<span class="cons_Constructor"><span id="Type_50_22" title="Not referenced">Type</span></span>       = &lt;<span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-CTerm</span>&gt;&gt;

  <a href="#NaBL2-CGenTypePattern_28_71" id="NaBL2-CGenTypePattern_52_3" title="Referenced at line 28, 32">NaBL2-CGenTypePattern</a>.<span class="cons_Constructor"><span id="NoType_52_25" title="Not referenced">NoType</span></span>  =
  <a href="#NaBL2-CGenTypePattern_28_71" id="NaBL2-CGenTypePattern_53_3" title="Referenced at line 28, 32">NaBL2-CGenTypePattern</a>.<span class="cons_Constructor"><span id="Type_53_25" title="Not referenced">Type</span></span>    = &lt;<span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-CTerm</span>&gt;&gt;


</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
