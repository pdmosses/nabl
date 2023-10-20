---
title: Rules.sdf3
hide:
  - toc
---

# `Rules.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/Rules.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/Rules.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/rules/Rules.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../CGen.sdf3/#nabl2/lang/rules/Rules_227_249" id="nabl2/lang/rules/Rules_7_29" title="Referenced at ../CGen.sdf3 line 12; ../../Main.sdf3 line 7">nabl2/lang/rules/Rules</a>

<span class="keyword">imports</span>

  <a href="../CGen.sdf3/#nabl2/lang/rules/CGen_7_28" id="nabl2/lang/rules/CGen_42_63" title="Defined at ../CGen.sdf3 line 1">nabl2/lang/rules/CGen</a>
  <a href="../Names.sdf3/#nabl2/lang/rules/Names_7_29" id="nabl2/lang/rules/Names_66_88" title="Defined at ../Names.sdf3 line 1">nabl2/lang/rules/Names</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-ModuleSection_160_179" title="Not referenced locally, nor via imports">NaBL2-ModuleSection</span>.<span class="cons_Constructor"><span id="Rules_180_185" title="Not referenced locally, nor via imports">Rules</span></span> = &lt;
    <span class="cons_String">rules</span>
 
      &lt;{<a href="../CGen.sdf3/#NaBL2-Rule_300_310" id="NaBL2-Rule_210_220" title="Defined at ../CGen.sdf3 line 18, 22, 27, 31">NaBL2-Rule</a> <span class="cons_Lit">"\n\n"</span>}*&gt;

  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">lexical syntax</span>

  <span id="NaBL2-SectionKeyword_271_291" title="Not referenced locally, nor via imports">NaBL2-SectionKeyword</span> = <span class="cons_Lit">"rules"</span>

</code></pre></td></tr></tbody></table></div>