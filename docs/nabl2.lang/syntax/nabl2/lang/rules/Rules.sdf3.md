---
title: Rules.sdf3
hide:
  - toc
---

# `Rules.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/rules/Rules.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/rules/Rules.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/rules/Rules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="nabl2/lang/rules/Rules_1_8" title="a definition with multiple references" data-urls="../CGen.sdf3/#nabl2/lang/rules/Rules line 12_3; ../../Main.sdf3/#nabl2/lang/rules/Rules line 7_3">nabl2/lang/rules/Rules</button>

<span class="keyword">imports</span>

  <a href="../CGen.sdf3/#nabl2/lang/rules/CGen_1_8" id="nabl2/lang/rules/CGen_5_3" title="a reference to a single-file definition">nabl2/lang/rules/CGen</a>
  <a href="../Names.sdf3/#nabl2/lang/rules/Names_1_8" id="nabl2/lang/rules/Names_6_3" title="a reference to a single-file definition">nabl2/lang/rules/Names</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-ModuleSection_14_3" title="a definition with no references">NaBL2-ModuleSection</span>.<span class="cons_Constructor"><span id="Rules_14_23" title="a definition with no references">Rules</span></span> = &lt;
    <span class="cons_String">rules</span>
 
      &lt;{<a href="../CGen.sdf3/#NaBL2-Rule_18_3" id="NaBL2-Rule_17_9" title="a reference to a single-file definition">NaBL2-Rule</a> <span class="cons_Lit">"\n\n"</span>}*&gt;

  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">lexical syntax</span>

  <span id="NaBL2-SectionKeyword_23_3" title="a definition with no references">NaBL2-SectionKeyword</span> = <span class="cons_Lit">"rules"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
