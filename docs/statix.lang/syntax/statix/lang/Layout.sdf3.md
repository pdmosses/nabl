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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/lang/Layout_1_8" title="Multi-file references" data-urls="../../../StatixLang.sdf3/#statix/lang/Layout_5_3 line 5; ../../cli/CLI.sdf3/#statix/lang/Layout_5_3 line 5; ../../test/Result.sdf3/#statix/lang/Layout_7_3 line 7; ../../test/Test.sdf3/#statix/lang/Layout_5_3 line 5">statix/lang/Layout</button>

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span> = [\t\ \r\n]
  <span class="keyword">LAYOUT</span> = <a href="#LineComment_11_3" id="LineComment_6_12" title="Defined at line 11">LineComment</a>
  <span class="keyword">LAYOUT</span> = <a href="#BlockComment_13_3" id="BlockComment_7_12" title="Defined at line 13">BlockComment</a>

  <a href="#EOF_11_45" id="EOF_9_3" title="Referenced at line 11, 13, 21">EOF</a> =  

  <a href="#LineComment_6_12" id="LineComment_11_3" title="Referenced at line 6">LineComment</a>     = <span class="cons_Lit">"//"</span> ~[\r\n]* ([\r\n] | <a href="#EOF_9_3" id="EOF_11_45" title="Defined at line 9">EOF</a>)

  <a href="#BlockComment_7_12" id="BlockComment_13_3" title="Referenced at line 7, 13">BlockComment</a>    = <span class="cons_Lit">"/*"</span> <a href="#CommentText_14_3" id="CommentText_13_26" title="Defined at line 14">CommentText</a> (<a href="#BlockComment_13_3" id="BlockComment_13_39" title="Defined at line 13">BlockComment</a> <a href="#CommentText_14_3" id="CommentText_13_52" title="Defined at line 14">CommentText</a>)* (<span class="cons_Lit">"*/"</span> | <a href="#EOF_9_3" id="EOF_13_74" title="Defined at line 9">EOF</a>)
  <a href="#CommentText_13_26" id="CommentText_14_3" title="Referenced at line 13, 22">CommentText</a>     = <a href="#CommentChar_15_3" id="CommentChar_14_21" title="Defined at line 15">CommentChar</a>*
  <a href="#CommentChar_14_21" id="CommentChar_15_3" title="Referenced at line 14">CommentChar</a>     = ~[\*\/] | <a href="#CommentAsterisk_17_3" id="CommentAsterisk_15_31" title="Defined at line 17">CommentAsterisk</a> | <a href="#CommentSlash_16_3" id="CommentSlash_15_49" title="Defined at line 16">CommentSlash</a>
  <a href="#CommentSlash_15_49" id="CommentSlash_16_3" title="Referenced at line 15, 24">CommentSlash</a>    = <span class="cons_Lit">"/"</span>
  <a href="#CommentAsterisk_15_31" id="CommentAsterisk_17_3" title="Referenced at line 15, 23">CommentAsterisk</a> = <span class="cons_Lit">"*"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#EOF_9_3" id="EOF_21_3" title="Defined at line 9">EOF</a>             -/- ~[]
  <a href="#CommentText_14_3" id="CommentText_22_3" title="Defined at line 14">CommentText</a>     -/- ~[\*\/]
  <a href="#CommentAsterisk_17_3" id="CommentAsterisk_23_3" title="Defined at line 17">CommentAsterisk</a> -/- [\/]
  <a href="#CommentSlash_16_3" id="CommentSlash_24_3" title="Defined at line 16">CommentSlash</a>    -/- [\*]

<span class="keyword">context-free restrictions</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\r\n]   <span class="layout">// whitespace</span>
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]    <span class="layout">// line comment start</span>
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]    <span class="layout">// block comment start</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
