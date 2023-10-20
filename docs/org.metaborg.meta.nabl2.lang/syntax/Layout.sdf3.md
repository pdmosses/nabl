---
title: Layout.sdf3
hide:
  - toc
---

# `Layout.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/Layout.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/Layout.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/Layout.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../NaBL2Lang.sdf3/#Layout_98_104" id="Layout_7_13" title="Referenced at ../NaBL2Lang.sdf3 line 7">Layout</a>

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span> = [\t\ \r\n]
  <span class="keyword">LAYOUT</span> = <a href="#LineComment_114_125" id="LineComment_64_75" title="Defined at line 11">LineComment</a>
  <span class="keyword">LAYOUT</span> = <a href="#BlockComment_164_176" id="BlockComment_87_99" title="Defined at line 13">BlockComment</a>

  <a href="#EOF_156_159" id="EOF_103_106" title="Referenced at line 11, 13, 21">EOF</a> =  

  <a href="#LineComment_64_75" id="LineComment_114_125" title="Referenced at line 6">LineComment</a>     = <span class="cons_Lit">"//"</span> ~[\r\n]* ([\r\n] | <a href="#EOF_103_106" id="EOF_156_159" title="Defined at line 9">EOF</a>)

  <a href="#BlockComment_87_99" id="BlockComment_164_176" title="Referenced at line 7, 13">BlockComment</a>    = <span class="cons_Lit">"/*"</span> <a href="#CommentText_242_253" id="CommentText_187_198" title="Defined at line 14">CommentText</a> (<a href="#BlockComment_164_176" id="BlockComment_200_212" title="Defined at line 13">BlockComment</a> <a href="#CommentText_242_253" id="CommentText_213_224" title="Defined at line 14">CommentText</a>)* (<span class="cons_Lit">"*/"</span> | <a href="#EOF_103_106" id="EOF_235_238" title="Defined at line 9">EOF</a>)
  <a href="#CommentText_187_198" id="CommentText_242_253" title="Referenced at line 13, 22">CommentText</a>     = <a href="#CommentChar_275_286" id="CommentChar_260_271" title="Defined at line 15">CommentChar</a>*
  <a href="#CommentChar_260_271" id="CommentChar_275_286" title="Referenced at line 14">CommentChar</a>     = ~[\*\/] | <a href="#CommentAsterisk_360_375" id="CommentAsterisk_303_318" title="Defined at line 17">CommentAsterisk</a> | <a href="#CommentSlash_336_348" id="CommentSlash_321_333" title="Defined at line 16">CommentSlash</a>
  <a href="#CommentSlash_321_333" id="CommentSlash_336_348" title="Referenced at line 15, 24">CommentSlash</a>    = <span class="cons_Lit">"/"</span>
  <a href="#CommentAsterisk_303_318" id="CommentAsterisk_360_375" title="Referenced at line 15, 23">CommentAsterisk</a> = <span class="cons_Lit">"*"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#EOF_103_106" id="EOF_407_410" title="Defined at line 9">EOF</a>             -/- ~[]
  <a href="#CommentText_242_253" id="CommentText_433_444" title="Defined at line 14">CommentText</a>     -/- ~[\*\/]
  <a href="#CommentAsterisk_360_375" id="CommentAsterisk_463_478" title="Defined at line 17">CommentAsterisk</a> -/- [\/]
  <a href="#CommentSlash_336_348" id="CommentSlash_490_502" title="Defined at line 16">CommentSlash</a>    -/- [\*]

<span class="keyword">context-free restrictions</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\r\n]   <span class="layout">// whitespace</span>
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]    <span class="layout">// line comment start</span>
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]    <span class="layout">// block comment start</span>

</code></pre></td></tr></tbody></table></div>