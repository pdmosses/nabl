---
title: Signature.sdf3
hide:
  - toc
---

# `Signature.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Signature.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Signature.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Signature.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../Main.sdf3/#nabl2/lang/signatures/Signature_8_3" id="nabl2/lang/signatures/Signature_1_8" title="Referenced at ../../Main.sdf3 line 8">nabl2/lang/signatures/Signature</a>

<span class="keyword">imports</span>

  <a href="../CGen.sdf3/#nabl2/lang/signatures/CGen_1_8" id="nabl2/lang/signatures/CGen_5_3" title="Defined at ../CGen.sdf3 line 1">nabl2/lang/signatures/CGen</a>
  <a href="../Constructors.sdf3/#nabl2/lang/signatures/Constructors_1_8" id="nabl2/lang/signatures/Constructors_6_3" title="Defined at ../Constructors.sdf3 line 1">nabl2/lang/signatures/Constructors</a>
  <a href="../Functions.sdf3/#nabl2/lang/signatures/Functions_1_8" id="nabl2/lang/signatures/Functions_7_3" title="Defined at ../Functions.sdf3 line 1">nabl2/lang/signatures/Functions</a>
  <a href="../NameResolution.sdf3/#nabl2/lang/signatures/NameResolution_1_8" id="nabl2/lang/signatures/NameResolution_8_3" title="Defined at ../NameResolution.sdf3 line 1">nabl2/lang/signatures/NameResolution</a>
  <a href="../Relations.sdf3/#nabl2/lang/signatures/Relations_1_8" id="nabl2/lang/signatures/Relations_9_3" title="Defined at ../Relations.sdf3 line 1">nabl2/lang/signatures/Relations</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-ModuleSection_17_3" title="Not referenced">NaBL2-ModuleSection</span>.<span class="cons_Constructor"><span id="Signature_17_23" title="Not referenced">Signature</span></span> = &lt;
    <span class="cons_String">signature</span>
      &lt;{<a href="../NameResolution.sdf3/#NaBL2-Signature_16_3" id="NaBL2-Signature_19_9" title="Defined at ../NameResolution.sdf3 line 16, 31">NaBL2-Signature</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt;

<span class="keyword">lexical syntax</span>

  <span id="NaBL2-SectionKeyword_24_3" title="Not referenced">NaBL2-SectionKeyword</span> = <span class="cons_Lit">"signature"</span>


</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
