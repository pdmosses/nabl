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
<td class="code"><pre><code><span class="keyword">module</span> <span id="StatixLang_7_17" title="Not referenced locally, nor via imports">StatixLang</span>

<span class="keyword">imports</span>

  <a href="../statix/lang/Layout.sdf3#statix/lang/Layout_7_25" id="statix/lang/Layout_30_48" title="Defined at ../statix/lang/Layout.sdf3 line 1">statix/lang/Layout</a>
  <a href="../statix/lang/Common.sdf3#statix/lang/Common_7_25" id="statix/lang/Common_51_69" title="Defined at ../statix/lang/Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../statix/lang/Core.sdf3#statix/lang/Core_7_23" id="statix/lang/Core_72_88" title="Defined at ../statix/lang/Core.sdf3 line 1">statix/lang/Core</a>
  <a href="../statix/lang/Sugar.sdf3#statix/lang/Sugar_7_24" id="statix/lang/Sugar_91_108" title="Defined at ../statix/lang/Sugar.sdf3 line 1">statix/lang/Sugar</a>
  <a href="../statix/lang/PreCompiled.sdf3#statix/lang/PreCompiled_7_30" id="statix/lang/PreCompiled_111_134" title="Defined at ../statix/lang/PreCompiled.sdf3 line 1">statix/lang/PreCompiled</a>
  <a href="../statix/lang/Deprecated.sdf3#statix/lang/Deprecated_7_29" id="statix/lang/Deprecated_137_159" title="Defined at ../statix/lang/Deprecated.sdf3 line 1">statix/lang/Deprecated</a>

  <a href="../statix/test/Test.sdf3#statix/test/Test_7_23" id="statix/test/Test_163_179" title="Defined at ../statix/test/Test.sdf3 line 1">statix/test/Test</a>

  <a href="../statix/cli/CLI.sdf3#statix/cli/CLI_7_21" id="statix/cli/CLI_183_197" title="Defined at ../statix/cli/CLI.sdf3 line 1">statix/cli/CLI</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

<span class="keyword">context-free start-symbols</span>

  <a href="#Start_336_341" id="Start_280_285" title="Defined at line 28, 29">Start</a>

  <a href="../statix/lang/Core.sdf3#LabelRE_4388_4395" id="LabelRE_289_296" title="Defined at ../statix/lang/Core.sdf3 line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a> <span class="layout">// for testing</span>

<span class="keyword">context-free syntax</span>

  <a href="#Start_280_285" id="Start_336_341" title="Referenced at line 22">Start</a> = <a href="../statix/lang/Core.sdf3#Module_337_343" id="Module_344_350" title="Defined at ../statix/lang/Core.sdf3 line 18">Module</a>
  <a href="#Start_280_285" id="Start_353_358" title="Referenced at line 22">Start</a> = <a href="../statix/test/Test.sdf3#Test_254_258" id="Test_361_365" title="Defined at ../statix/test/Test.sdf3 line 21">Test</a>

</code></pre></td></tr></tbody></table></div>