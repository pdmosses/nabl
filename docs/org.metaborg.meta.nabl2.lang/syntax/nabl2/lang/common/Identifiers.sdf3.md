---
title: Identifiers.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/common/Identifiers_1_8" title="Multi-file references" data-urls="../Main.sdf3/#nabl2/lang/common/Identifiers_6_3 line 6; ../../rules/CGen.sdf3/#nabl2/lang/common/Identifiers_9_3 line 9; ../../rules/Names.sdf3/#nabl2/lang/common/Identifiers_6_3 line 6">nabl2/lang/common/Identifiers</button>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="NaBL2-RuleId_9_3" title="Multi-file references" data-urls="#NaBL2-RuleId_14_3 line 14; ../../rules/Names.sdf3/#NaBL2-RuleId_16_37 line 16, 17, 21, 22, 25, 26, 30">NaBL2-RuleId</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]*
  <button class="modal-open" id="NaBL2-RuleId_10_3" title="Multi-file references" data-urls="#NaBL2-RuleId_14_3 line 14; ../../rules/Names.sdf3/#NaBL2-RuleId_16_37 line 16, 17, 21, 22, 25, 26, 30">NaBL2-RuleId</button> = <span class="cons_Lit">"init"</span> | <span class="cons_Lit">"default"</span> {<span class="keyword">case-insensitive</span>, <span class="keyword">reject</span>}

<span class="keyword">lexical restrictions</span>

  <a href="#NaBL2-RuleId_9_3" id="NaBL2-RuleId_14_3" title="Defined at line 9, 10">NaBL2-RuleId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
