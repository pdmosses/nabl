---
title: Module.sdf3
---

# `Module.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/modules/Module.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/modules/Module.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/modules/Module.sdf3 "The source file on GitHub"

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
33
34
35
36
37
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../Main.sdf3#nabl2/lang/modules/Module_60_85" id="nabl2/lang/modules/Module_7_32" title="Referenced at ../../Main.sdf3 line 6">nabl2/lang/modules/Module</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\.\-\_]

<span class="keyword">context-free syntax</span>

  <a href="../../../../NaBL2Lang.sdf3#NaBL2-Module_136_148" id="NaBL2-Module_108_120" title="Referenced at ../../../../NaBL2Lang.sdf3 line 11">NaBL2-Module</a>.<span class="cons_Constructor"><span id="Module_121_127" title="Not referenced locally, nor via imports">Module</span></span> = &lt;
    <span class="cons_String">module</span> &lt;<a href="#NaBL2-ModuleId_417_431" id="NaBL2-ModuleId_144_158" title="Defined at line 27, 29">NaBL2-ModuleId</a>&gt;

    &lt;{<a href="#NaBL2-ModuleSection_203_222" id="NaBL2-ModuleSection_167_186" title="Defined at line 15">NaBL2-ModuleSection</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;
 
  <a href="#NaBL2-ModuleSection_167_186" id="NaBL2-ModuleSection_203_222" title="Referenced at line 12">NaBL2-ModuleSection</a>.<span class="cons_Constructor"><span id="Imports_223_230" title="Not referenced locally, nor via imports">Imports</span></span> = &lt;
    <span class="cons_String">imports</span> &lt;<a href="#NaBL2-ImportModule_277_295" id="NaBL2-ImportModule_248_266" title="Defined at line 19, 23">NaBL2-ImportModule</a>*&gt;
  &gt;
 
  <a href="#NaBL2-ImportModule_248_266" id="NaBL2-ImportModule_277_295" title="Referenced at line 16">NaBL2-ImportModule</a>.<span class="cons_Constructor"><span id="Import_296_302" title="Not referenced locally, nor via imports">Import</span></span> = &lt;&lt;<a href="#NaBL2-ModuleId_417_431" id="NaBL2-ModuleId_307_321" title="Defined at line 27, 29">NaBL2-ModuleId</a>&gt;&gt; 

<span class="keyword">syntax</span>

  <a href="#NaBL2-ImportModule_248_266" id="NaBL2-ImportModule_336_354" title="Referenced at line 16">NaBL2-ImportModule</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ImportWildcard_358_372" title="Not referenced locally, nor via imports">ImportWildcard</span></span> = <a href="#NaBL2-ModuleId_417_431" id="NaBL2-ModuleId_375_389" title="Defined at line 27, 29">NaBL2-ModuleId</a><span class="keyword">-CF</span> <span class="cons_Lit">"/-"</span>

<span class="keyword">lexical syntax</span>

  <a href="#NaBL2-ModuleId_675_689" id="NaBL2-ModuleId_417_431" title="Referenced at line 37">NaBL2-ModuleId</a> = {<a href="#NaBL2-ModuleIdPart_462_480" id="NaBL2-ModuleIdPart_435_453" title="Defined at line 28">NaBL2-ModuleIdPart</a> <span class="cons_Lit">"/"</span>}+
  <a href="#NaBL2-ModuleIdPart_435_453" id="NaBL2-ModuleIdPart_462_480" title="Referenced at line 27">NaBL2-ModuleIdPart</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\.\-\_]*
  <a href="#NaBL2-ModuleId_675_689" id="NaBL2-ModuleId_515_529" title="Referenced at line 37">NaBL2-ModuleId</a> = <a href="#NaBL2-SectionKeyword_617_637" id="NaBL2-SectionKeyword_532_552" title="Defined at line 33">NaBL2-SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <span id="NaBL2-RuleId_567_579" title="Not referenced locally, nor via imports">NaBL2-RuleId</span> = <a href="#NaBL2-SectionKeyword_617_637" id="NaBL2-SectionKeyword_582_602" title="Defined at line 33">NaBL2-SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <a href="#NaBL2-SectionKeyword_582_602" id="NaBL2-SectionKeyword_617_637" title="Referenced at line 31">NaBL2-SectionKeyword</a> = <span class="cons_Lit">"imports"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#NaBL2-ModuleId_417_431" id="NaBL2-ModuleId_675_689" title="Defined at line 27, 29">NaBL2-ModuleId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\.\-\_]


</code></pre></td></tr></tbody></table></div>