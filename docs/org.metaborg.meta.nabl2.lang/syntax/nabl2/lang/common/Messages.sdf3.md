---
title: Messages.sdf3
hide:
  - toc
---

# `Messages.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Messages.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Messages.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Messages.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Main.sdf3#nabl2/lang/common/Messages_132_158" id="nabl2/lang/common/Messages_7_33" title="Referenced at ../Main.sdf3 line 8">nabl2/lang/common/Messages</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/CTerms</span>
  <a href="../Terms.sdf3#nabl2/lang/common/Terms_7_30" id="nabl2/lang/common/Terms_75_98" title="Defined at ../Terms.sdf3 line 1">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">syntax</span>

  <span id="NaBL2-MessageContent_159_179" title="Not referenced locally, nor via imports">NaBL2-MessageContent</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Formatted_183_192" title="Not referenced locally, nor via imports">Formatted</span></span> = <span class="cons_Lit">"$["</span> <a href="#NaBL2-MessageContentPart_343_367" id="NaBL2-MessageContentPart_200_224" title="Defined at line 21, 22">NaBL2-MessageContentPart</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span>

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-MessageContent_257_277" title="Not referenced locally, nor via imports">NaBL2-MessageContent</span>.<span class="cons_Constructor"><span id="Default_278_285" title="Not referenced locally, nor via imports">Default</span></span>  =
  <span id="NaBL2-MessageContent_291_311" title="Not referenced locally, nor via imports">NaBL2-MessageContent</span>          = <a href="../Terms.sdf3#NaBL2-StringTerm_880_896" id="NaBL2-StringTerm_323_339" title="Defined at ../Terms.sdf3 line 38">NaBL2-StringTerm</a>

  <a href="#NaBL2-MessageContentPart_200_224" id="NaBL2-MessageContentPart_343_367" title="Referenced at line 14">NaBL2-MessageContentPart</a>.<span class="cons_Constructor"><span id="Term_368_372" title="Not referenced locally, nor via imports">Term</span></span> = &lt;<span class="cons_String">[</span>&lt;<span title="External reference">NaBL2-CTerm</span>&gt;<span class="cons_String">]</span>&gt;
  <a href="#NaBL2-MessageContentPart_200_224" id="NaBL2-MessageContentPart_395_419" title="Referenced at line 14">NaBL2-MessageContentPart</a>.<span class="cons_Constructor"><span id="Text_420_424" title="Not referenced locally, nor via imports">Text</span></span> = <a href="#NaBL2-MessageChars_465_483" id="NaBL2-MessageChars_427_445" title="Defined at line 26">NaBL2-MessageChars</a>

<span class="keyword">lexical syntax</span>

  <a href="#NaBL2-MessageChars_615_633" id="NaBL2-MessageChars_465_483" title="Referenced at line 32">NaBL2-MessageChars</a> = <a href="#NaBL2-MessageChar_507_524" id="NaBL2-MessageChar_486_503" title="Defined at line 27, 28">NaBL2-MessageChar</a>+
  <a href="#NaBL2-MessageChar_486_503" id="NaBL2-MessageChar_507_524" title="Referenced at line 26">NaBL2-MessageChar</a>  = ~[\[\]\\\t\r\n]
  <a href="#NaBL2-MessageChar_486_503" id="NaBL2-MessageChar_546_563" title="Referenced at line 26">NaBL2-MessageChar</a>  = <span class="cons_Lit">"\\["</span> | <span class="cons_Lit">"\\]"</span> | <span class="cons_Lit">"\\\\"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#NaBL2-MessageChars_465_483" id="NaBL2-MessageChars_615_633" title="Defined at line 26">NaBL2-MessageChars</a> -/- ~[\[\]]

</code></pre></td></tr></tbody></table></div>