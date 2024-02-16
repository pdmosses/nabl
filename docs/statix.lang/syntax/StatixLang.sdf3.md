---
title: StatixLang.sdf3
hide:
  - toc
---

# `StatixLang.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/StatixLang.sdf3]

[pdmosses/nabl/statix.lang/syntax/StatixLang.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/StatixLang.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="StatixLang_1_8" title="a definition with no references">StatixLang</span>

<span class="keyword">imports</span>

  <a href="../statix/lang/Layout.sdf3/#statix/lang/Layout_1_8" id="statix/lang/Layout_5_3" title="a reference to a single-file definition">statix/lang/Layout</a>
  <a href="../statix/lang/Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_6_3" title="a reference to a single-file definition">statix/lang/Common</a>
  <a href="../statix/lang/Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_7_3" title="a reference to a single-file definition">statix/lang/Core</a>
  <a href="../statix/lang/Sugar.sdf3/#statix/lang/Sugar_1_8" id="statix/lang/Sugar_8_3" title="a reference to a single-file definition">statix/lang/Sugar</a>
  <a href="../statix/lang/PreCompiled.sdf3/#statix/lang/PreCompiled_1_8" id="statix/lang/PreCompiled_9_3" title="a reference to a single-file definition">statix/lang/PreCompiled</a>
  <a href="../statix/lang/Deprecated.sdf3/#statix/lang/Deprecated_1_8" id="statix/lang/Deprecated_10_3" title="a reference to a single-file definition">statix/lang/Deprecated</a>

  <a href="../statix/test/Test.sdf3/#statix/test/Test_1_8" id="statix/test/Test_12_3" title="a reference to a single-file definition">statix/test/Test</a>

  <a href="../statix/cli/CLI.sdf3/#statix/cli/CLI_1_8" id="statix/cli/CLI_14_3" title="a reference to a single-file definition">statix/cli/CLI</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

<span class="keyword">context-free start-symbols</span>

  <a href="#Start_28_3" id="Start_22_3" title="a reference to a single-file definition">Start</a>

  <a href="../statix/lang/Deprecated.sdf3/#LabelRE_87_3" id="LabelRE_24_3" title="a reference to a single-file definition">LabelRE</a> <span class="layout">// for testing</span>

<span class="keyword">context-free syntax</span>

  <a href="#Start_22_3" id="Start_28_3" title="a definition with a single reference">Start</a> = <a href="../statix/lang/Core.sdf3/#Module_18_3" id="Module_28_11" title="a reference to a single-file definition">Module</a>
  <a href="#Start_22_3" id="Start_29_3" title="a definition with a single reference">Start</a> = <a href="../statix/test/Test.sdf3/#Test_21_3" id="Test_29_11" title="a reference to a single-file definition">Test</a>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
