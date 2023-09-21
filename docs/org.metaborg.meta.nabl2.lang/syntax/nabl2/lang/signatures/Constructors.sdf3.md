---
title: Constructors.sdf3
---

# `Constructors.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Constructors.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Constructors.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Constructors.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3#nabl2/lang/signatures/Constructors_80_114" id="nabl2/lang/signatures/Constructors_7_41" title="Referenced at ../Signature.sdf3 line 6">nabl2/lang/signatures/Constructors</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/Sorts</span>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_187_202" title="Not referenced locally, nor via imports">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Sorts_203_208" title="Not referenced locally, nor via imports">Sorts</span></span> = &lt;
    <span class="cons_String">sorts</span>
      &lt;{<span class="keyword">Na</span>BL2-Sort "\<span class="cons_Lit">n"}*</span>&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <span class="keyword">Na</span><span id="NaBL2-Signature_273_288" title="Not referenced locally, nor via imports">BL2-Signature.C</span><span class="keyword">o</span><span class="cons_Constructor"><span id="Constructors_289_301" title="Not referenced locally, nor via imports">nstructors =</span></span> &lt;
    co<span class="cons_String">nstructors
 </span>     &lt;{<span class="keyword">Na</span><a href="#NaBL2-OpDecl_375_387" id="NaBL2-OpDecl_331_343" title="Defined at line 24, 25">BL2-OpDecl "</a>\<span class="cons_Lit">n"}*</span>&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <span class="keyword">Na</span><a href="#NaBL2-OpDecl_331_343" id="NaBL2-OpDecl_375_387" title="Referenced at line 21">BL2-OpDecl.O</a><span class="keyword">p</span><span class="cons_Constructor"><span id="OpDecl_388_394" title="Not referenced locally, nor via imports">Decl  </span></span>      = [[<span class="keyword">Na</span><span class="keyword">BL</span>2-<span class="keyword">OpId</span>] : [{NaBL2-So<span class="keyword">r</span>t<span class="cons_String">R</span>e<span class="keyword">f</span> " * "}*] -&gt; [Na<span class="keyword">B</span><span class="cons_Lit">L2-So</span><span class="keyword">rt</span>]]<span class="cons_String">
 </span> <span class="keyword">N</span><span class="keyword">a</span>BL2-OpDecl.<span class="keyword">Null</span><a href="#NaBL2-OpDecl_331_343" id="NaBL2-OpDecl_464_476" title="Referenced at line 21">aryOpDecl = </a>[<span class="cons_Constructor"><span id="NullaryOpDecl_477_490" title="Not referenced locally, nor via imports">[NaBL2-OpId] </span></span>: [<span class="keyword">Na</span><span class="keyword">BL</span>2-<span class="keyword">S</span>ort]]

</code></pre></td></tr></tbody></table></div>