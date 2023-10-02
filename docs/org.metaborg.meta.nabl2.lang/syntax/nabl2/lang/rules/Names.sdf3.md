---
title: Names.sdf3
hide:
  - toc
---

# `Names.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/Names.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/Names.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/Names.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../signatures/CGen.sdf3#nabl2/lang/rules/Names_74_96" id="nabl2/lang/rules/Names_7_29" title="Referenced at ../../signatures/CGen.sdf3 line 6">nabl2/lang/rules/Names</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <a href="../../common/Identifiers.sdf3#nabl2/lang/common/Identifiers_7_36" id="nabl2/lang/common/Identifiers_76_105" title="Defined at ../../common/Identifiers.sdf3 line 1">nabl2/lang/common/Identifiers</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">syntax</span>

  <a href="../CGen.sdf3#NaBL2-CGenRuleDef_688_705" id="NaBL2-CGenRuleDef_164_181" title="Referenced at ../CGen.sdf3 line 32; ../../signatures/CGen.sdf3 line 22">NaBL2-CGenRuleDef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DefaultRule_185_196" title="Not referenced locally, nor via imports">DefaultRule</span></span>     =
  <a href="../CGen.sdf3#NaBL2-CGenRuleDef_688_705" id="NaBL2-CGenRuleDef_205_222" title="Referenced at ../CGen.sdf3 line 32; ../../signatures/CGen.sdf3 line 22">NaBL2-CGenRuleDef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="InitRule_226_234" title="Not referenced locally, nor via imports">InitRule</span></span>   = <span class="cons_Lit">"init"</span>
  <a href="../CGen.sdf3#NaBL2-CGenRuleDef_688_705" id="NaBL2-CGenRuleDef_248_265" title="Referenced at ../CGen.sdf3 line 32; ../../signatures/CGen.sdf3 line 22">NaBL2-CGenRuleDef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="RuleNoArgs_269_279" title="Not referenced locally, nor via imports">RuleNoArgs</span></span> = <a href="../../common/Identifiers.sdf3#NaBL2-RuleId_100_112" id="NaBL2-RuleId_282_294" title="Defined at ../../common/Identifiers.sdf3 line 9, 10">NaBL2-RuleId</a><span class="keyword">-LEX</span>
  <a href="../CGen.sdf3#NaBL2-CGenRuleDef_688_705" id="NaBL2-CGenRuleDef_301_318" title="Referenced at ../CGen.sdf3 line 32; ../../signatures/CGen.sdf3 line 22">NaBL2-CGenRuleDef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Rule_322_326" title="Not referenced locally, nor via imports">Rule</span></span>       = <a href="../../common/Identifiers.sdf3#NaBL2-RuleId_100_112" id="NaBL2-RuleId_335_347" title="Defined at ../../common/Identifiers.sdf3 line 9, 10">NaBL2-RuleId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-RuleIds_843_856" id="NaBL2-RuleIds_367_380" title="Defined at line 30">NaBL2-RuleIds</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>


  <a href="../CGen.sdf3#NaBL2-CGenRuleRefTop_891_911" id="NaBL2-CGenRuleRefTop_403_423" title="Referenced at ../CGen.sdf3 line 38">NaBL2-CGenRuleRefTop</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DefaultRule_427_438" title="Not referenced locally, nor via imports">DefaultRule</span></span>     =
  <a href="../CGen.sdf3#NaBL2-CGenRuleRefTop_891_911" id="NaBL2-CGenRuleRefTop_447_467" title="Referenced at ../CGen.sdf3 line 38">NaBL2-CGenRuleRefTop</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="RuleNoArgs_471_481" title="Not referenced locally, nor via imports">RuleNoArgs</span></span> = <a href="../../common/Identifiers.sdf3#NaBL2-RuleId_100_112" id="NaBL2-RuleId_484_496" title="Defined at ../../common/Identifiers.sdf3 line 9, 10">NaBL2-RuleId</a><span class="keyword">-LEX</span>
  <a href="../CGen.sdf3#NaBL2-CGenRuleRefTop_891_911" id="NaBL2-CGenRuleRefTop_503_523" title="Referenced at ../CGen.sdf3 line 38">NaBL2-CGenRuleRefTop</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Rule_527_531" title="Not referenced locally, nor via imports">Rule</span></span>       = <a href="../../common/Identifiers.sdf3#NaBL2-RuleId_100_112" id="NaBL2-RuleId_540_552" title="Defined at ../../common/Identifiers.sdf3 line 9, 10">NaBL2-RuleId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-CGenRuleRefs_889_907" id="NaBL2-CGenRuleRefs_572_590" title="Defined at line 32">NaBL2-CGenRuleRefs</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

  <a href="#NaBL2-CGenRuleRef_913_930" id="NaBL2-CGenRuleRef_612_629" title="Referenced at line 32">NaBL2-CGenRuleRef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DefaultRule_633_644" title="Not referenced locally, nor via imports">DefaultRule</span></span>     = <span class="cons_Lit">"default"</span>
  <a href="#NaBL2-CGenRuleRef_913_930" id="NaBL2-CGenRuleRef_663_680" title="Referenced at line 32">NaBL2-CGenRuleRef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="RuleNoArgs_684_694" title="Not referenced locally, nor via imports">RuleNoArgs</span></span> = <a href="../../common/Identifiers.sdf3#NaBL2-RuleId_100_112" id="NaBL2-RuleId_697_709" title="Defined at ../../common/Identifiers.sdf3 line 9, 10">NaBL2-RuleId</a><span class="keyword">-LEX</span>
  <a href="#NaBL2-CGenRuleRef_913_930" id="NaBL2-CGenRuleRef_716_733" title="Referenced at line 32">NaBL2-CGenRuleRef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Rule_737_741" title="Not referenced locally, nor via imports">Rule</span></span>       = <a href="../../common/Identifiers.sdf3#NaBL2-RuleId_100_112" id="NaBL2-RuleId_750_762" title="Defined at ../../common/Identifiers.sdf3 line 9, 10">NaBL2-RuleId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-CGenRuleRefs_889_907" id="NaBL2-CGenRuleRefs_782_800" title="Defined at line 32">NaBL2-CGenRuleRefs</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-RuleIds_367_380" id="NaBL2-RuleIds_843_856" title="Referenced at line 17">NaBL2-RuleIds</a> = &lt;&lt;{<a href="../../common/Identifiers.sdf3#NaBL2-RuleId_100_112" id="NaBL2-RuleId_862_874" title="Defined at ../../common/Identifiers.sdf3 line 9, 10">NaBL2-RuleId</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  
  <a href="#NaBL2-CGenRuleRefs_782_800" id="NaBL2-CGenRuleRefs_889_907" title="Referenced at line 26">NaBL2-CGenRuleRefs</a> = &lt;&lt;{<a href="#NaBL2-CGenRuleRef_612_629" id="NaBL2-CGenRuleRef_913_930" title="Defined at line 24, 25, 26">NaBL2-CGenRuleRef</a> <span class="cons_Lit">", "</span>}*&gt;&gt;

</code></pre></td></tr></tbody></table></div>