---
title: Identifiers.sdf3
---

# `Identifiers.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Identifiers.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Identifiers.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Identifiers.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../rules/Names.sdf3#nabl2/lang/common/Identifiers_76_105" id="nabl2/lang/common/Identifiers_7_36" title="Referenced at ../../rules/Names.sdf3 line 6">nabl2/lang/common/Identifiers</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>

<span class="keyword">lexical syntax</span>

  <a href="#NaBL2-RuleId_225_237" id="NaBL2-RuleId_100_112" title="Referenced at line 14; ../../rules/Names.sdf3 line 30">NaBL2-RuleId</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]*
  <a href="#NaBL2-RuleId_225_237" id="NaBL2-RuleId_139_151" title="Referenced at line 14; ../../rules/Names.sdf3 line 30">NaBL2-RuleId</a> = <span class="cons_Lit">"init"</span> | <span class="cons_Lit">"default"</span> {<span class="keyword">case-insensitive</span>, <span class="keyword">reject</span>}

<span class="keyword">lexical restrictions</span>

  <a href="#NaBL2-RuleId_100_112" id="NaBL2-RuleId_225_237" title="Defined at line 9, 10">NaBL2-RuleId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]

</code></pre></td></tr></tbody></table></div>