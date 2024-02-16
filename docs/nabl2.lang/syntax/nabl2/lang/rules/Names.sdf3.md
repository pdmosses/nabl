---
title: Names.sdf3
hide:
  - toc
---

# `Names.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/rules/Names.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/rules/Names.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/rules/Names.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/rules/Names_1_8" title="a definition with multiple references" data-urls="../CGen.sdf3/#nabl2/lang/rules/Names line 13_3; ../Rules.sdf3/#nabl2/lang/rules/Names line 6_3; ../../signatures/CGen.sdf3/#nabl2/lang/rules/Names line 6_3">nabl2/lang/rules/Names</button>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#nabl2/shared/common/Identifiers_1_8" id="nabl2/shared/common/Identifiers_5_3" title="a reference to a single-file definition">nabl2/shared/common/Identifiers</a>
  <a href="../../common/Identifiers.sdf3/#nabl2/lang/common/Identifiers_1_8" id="nabl2/lang/common/Identifiers_6_3" title="a reference to a single-file definition">nabl2/lang/common/Identifiers</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">syntax</span>

  <button class="modal-open" id="NaBL2-CGenRuleDef_14_3" title="a definition with multiple references" data-urls="../CGen.sdf3/#NaBL2-CGenRuleDef line 28_6, 32_6; ../../signatures/CGen.sdf3/#NaBL2-CGenRuleDef line 22_33">NaBL2-CGenRuleDef</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DefaultRule_14_24" title="a definition with no references">DefaultRule</span></span>     =
  <button class="modal-open" id="NaBL2-CGenRuleDef_15_3" title="a definition with multiple references" data-urls="../CGen.sdf3/#NaBL2-CGenRuleDef line 28_6, 32_6; ../../signatures/CGen.sdf3/#NaBL2-CGenRuleDef line 22_33">NaBL2-CGenRuleDef</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="InitRule_15_24" title="a definition with no references">InitRule</span></span>   = <span class="cons_Lit">"init"</span>
  <button class="modal-open" id="NaBL2-CGenRuleDef_16_3" title="a definition with multiple references" data-urls="../CGen.sdf3/#NaBL2-CGenRuleDef line 28_6, 32_6; ../../signatures/CGen.sdf3/#NaBL2-CGenRuleDef line 22_33">NaBL2-CGenRuleDef</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="RuleNoArgs_16_24" title="a definition with no references">RuleNoArgs</span></span> = <a href="../../common/Identifiers.sdf3/#NaBL2-RuleId_9_3" id="NaBL2-RuleId_16_37" title="a reference to a single-file definition">NaBL2-RuleId</a><span class="keyword">-LEX</span>
  <button class="modal-open" id="NaBL2-CGenRuleDef_17_3" title="a definition with multiple references" data-urls="../CGen.sdf3/#NaBL2-CGenRuleDef line 28_6, 32_6; ../../signatures/CGen.sdf3/#NaBL2-CGenRuleDef line 22_33">NaBL2-CGenRuleDef</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Rule_17_24" title="a definition with no references">Rule</span></span>       = <a href="../../common/Identifiers.sdf3/#NaBL2-RuleId_9_3" id="NaBL2-RuleId_17_37" title="a reference to a single-file definition">NaBL2-RuleId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-RuleIds_30_3" id="NaBL2-RuleIds_17_69" title="a reference to a single-file definition">NaBL2-RuleIds</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>


  <a href="../CGen.sdf3/#NaBL2-CGenRuleRefTop_38_36" id="NaBL2-CGenRuleRefTop_20_3" title="a definition with a single reference">NaBL2-CGenRuleRefTop</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DefaultRule_20_27" title="a definition with no references">DefaultRule</span></span>     =
  <a href="../CGen.sdf3/#NaBL2-CGenRuleRefTop_38_36" id="NaBL2-CGenRuleRefTop_21_3" title="a definition with a single reference">NaBL2-CGenRuleRefTop</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="RuleNoArgs_21_27" title="a definition with no references">RuleNoArgs</span></span> = <a href="../../common/Identifiers.sdf3/#NaBL2-RuleId_9_3" id="NaBL2-RuleId_21_40" title="a reference to a single-file definition">NaBL2-RuleId</a><span class="keyword">-LEX</span>
  <a href="../CGen.sdf3/#NaBL2-CGenRuleRefTop_38_36" id="NaBL2-CGenRuleRefTop_22_3" title="a definition with a single reference">NaBL2-CGenRuleRefTop</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Rule_22_27" title="a definition with no references">Rule</span></span>       = <a href="../../common/Identifiers.sdf3/#NaBL2-RuleId_9_3" id="NaBL2-RuleId_22_40" title="a reference to a single-file definition">NaBL2-RuleId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-CGenRuleRefs_32_3" id="NaBL2-CGenRuleRefs_22_72" title="a reference to a single-file definition">NaBL2-CGenRuleRefs</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

  <a href="#NaBL2-CGenRuleRef_32_27" id="NaBL2-CGenRuleRef_24_3" title="a definition with a single reference">NaBL2-CGenRuleRef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DefaultRule_24_24" title="a definition with no references">DefaultRule</span></span>     = <span class="cons_Lit">"default"</span>
  <a href="#NaBL2-CGenRuleRef_32_27" id="NaBL2-CGenRuleRef_25_3" title="a definition with a single reference">NaBL2-CGenRuleRef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="RuleNoArgs_25_24" title="a definition with no references">RuleNoArgs</span></span> = <a href="../../common/Identifiers.sdf3/#NaBL2-RuleId_9_3" id="NaBL2-RuleId_25_37" title="a reference to a single-file definition">NaBL2-RuleId</a><span class="keyword">-LEX</span>
  <a href="#NaBL2-CGenRuleRef_32_27" id="NaBL2-CGenRuleRef_26_3" title="a definition with a single reference">NaBL2-CGenRuleRef</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Rule_26_24" title="a definition with no references">Rule</span></span>       = <a href="../../common/Identifiers.sdf3/#NaBL2-RuleId_9_3" id="NaBL2-RuleId_26_37" title="a reference to a single-file definition">NaBL2-RuleId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-CGenRuleRefs_32_3" id="NaBL2-CGenRuleRefs_26_69" title="a reference to a single-file definition">NaBL2-CGenRuleRefs</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-RuleIds_17_69" id="NaBL2-RuleIds_30_3" title="a definition with a single reference">NaBL2-RuleIds</a> = &lt;&lt;{<a href="../../common/Identifiers.sdf3/#NaBL2-RuleId_9_3" id="NaBL2-RuleId_30_22" title="a reference to a single-file definition">NaBL2-RuleId</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  
  <button class="modal-open" id="NaBL2-CGenRuleRefs_32_3" title="a definition with multiple references" data-urls="#NaBL2-CGenRuleRefs line 22_72, 26_69">NaBL2-CGenRuleRefs</button> = &lt;&lt;{<a href="#NaBL2-CGenRuleRef_24_3" id="NaBL2-CGenRuleRef_32_27" title="a reference to a single-file definition">NaBL2-CGenRuleRef</a> <span class="cons_Lit">", "</span>}*&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
