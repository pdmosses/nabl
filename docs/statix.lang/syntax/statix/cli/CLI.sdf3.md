---
title: CLI.sdf3
---

# `CLI.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/cli/CLI.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/cli/CLI.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/cli/CLI.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../../StatixLang.sdf3#statix/cli/CLI_183_197" id="statix/cli/CLI_7_21" title="Referenced at ../../../StatixLang.sdf3 line 14">statix/cli/CLI</a>

<span class="keyword">imports</span>

  <a href="../../lang/Layout.sdf3#statix/lang/Layout_7_25" id="statix/lang/Layout_34_52" title="Defined at ../../lang/Layout.sdf3 line 1">statix/lang/Layout</a>
  <a href="../../lang/Common.sdf3#statix/lang/Common_7_25" id="statix/lang/Common_55_73" title="Defined at ../../lang/Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../../lang/Core.sdf3#statix/lang/Core_7_23" id="statix/lang/Core_76_92" title="Defined at ../../lang/Core.sdf3 line 1">statix/lang/Core</a>
  <a href="../../lang/Sugar.sdf3#statix/lang/Sugar_7_24" id="statix/lang/Sugar_95_112" title="Defined at ../../lang/Sugar.sdf3 line 1">statix/lang/Sugar</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

<span class="keyword">context-free start-symbols</span>

  <a href="#CommandLine_231_242" id="CommandLine_195_206" title="Defined at line 20">CommandLine</a>

<span class="keyword">context-free syntax</span>

  <a href="#CommandLine_195_206" id="CommandLine_231_242" title="Referenced at line 16">CommandLine</a>.<span class="cons_Constructor"><span id="Eval_243_247" title="Not referenced locally, nor via imports">Eval</span></span> = &lt;&lt;<a href="../../lang/Sugar.sdf3#Constraint_2068_2078" id="Constraint_252_262" title="Defined at ../../lang/Sugar.sdf3 line 94">Constraint</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>