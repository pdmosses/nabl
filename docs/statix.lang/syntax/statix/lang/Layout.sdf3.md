---
title: Layout.sdf3
hide:
  - toc
---

# `Layout.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/Layout.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/Layout.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/Layout.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../test/Test.sdf3#statix/lang/Layout_36_54" id="statix/lang/Layout_7_25" title="Referenced at ../../test/Test.sdf3 line 5">statix/lang/Layout</a>

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span> = [\t\ \r\n]
  <span class="keyword">LAYOUT</span> = <a href="#LineComment_126_137" id="LineComment_76_87" title="Defined at line 11">LineComment</a>
  <span class="keyword">LAYOUT</span> = <a href="#BlockComment_176_188" id="BlockComment_99_111" title="Defined at line 13">BlockComment</a>

  <a href="#EOF_419_422" id="EOF_115_118" title="Referenced at line 21">EOF</a> =  

  <a href="#LineComment_76_87" id="LineComment_126_137" title="Referenced at line 6">LineComment</a>     = <span class="cons_Lit">"//"</span> ~[\r\n]* ([\r\n] | <a href="#EOF_115_118" id="EOF_168_171" title="Defined at line 9">EOF</a>)

  <a href="#BlockComment_212_224" id="BlockComment_176_188" title="Referenced at line 13">BlockComment</a>    = <span class="cons_Lit">"/*"</span> <a href="#CommentText_254_265" id="CommentText_199_210" title="Defined at line 14">CommentText</a> (<a href="#BlockComment_176_188" id="BlockComment_212_224" title="Defined at line 13">BlockComment</a> <a href="#CommentText_254_265" id="CommentText_225_236" title="Defined at line 14">CommentText</a>)* (<span class="cons_Lit">"*/"</span> | <a href="#EOF_115_118" id="EOF_247_250" title="Defined at line 9">EOF</a>)
  <a href="#CommentText_445_456" id="CommentText_254_265" title="Referenced at line 22">CommentText</a>     = <a href="#CommentChar_287_298" id="CommentChar_272_283" title="Defined at line 15">CommentChar</a>*
  <a href="#CommentChar_272_283" id="CommentChar_287_298" title="Referenced at line 14">CommentChar</a>     = ~[\*\/] | <a href="#CommentAsterisk_372_387" id="CommentAsterisk_315_330" title="Defined at line 17">CommentAsterisk</a> | <a href="#CommentSlash_348_360" id="CommentSlash_333_345" title="Defined at line 16">CommentSlash</a>
  <a href="#CommentSlash_502_514" id="CommentSlash_348_360" title="Referenced at line 24">CommentSlash</a>    = <span class="cons_Lit">"/"</span>
  <a href="#CommentAsterisk_475_490" id="CommentAsterisk_372_387" title="Referenced at line 23">CommentAsterisk</a> = <span class="cons_Lit">"*"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#EOF_115_118" id="EOF_419_422" title="Defined at line 9">EOF</a>             -/- ~[]
  <a href="#CommentText_254_265" id="CommentText_445_456" title="Defined at line 14">CommentText</a>     -/- ~[\*\/]
  <a href="#CommentAsterisk_372_387" id="CommentAsterisk_475_490" title="Defined at line 17">CommentAsterisk</a> -/- [\/]
  <a href="#CommentSlash_348_360" id="CommentSlash_502_514" title="Defined at line 16">CommentSlash</a>    -/- [\*]

<span class="keyword">context-free restrictions</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\r\n]   <span class="layout">// whitespace</span>
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]    <span class="layout">// line comment start</span>
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]    <span class="layout">// block comment start</span>

</code></pre></td></tr></tbody></table></div>