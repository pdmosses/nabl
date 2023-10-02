---
title: Modules.sdf3
hide:
  - toc
---

# `Modules.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Modules.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Modules.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/core/Modules.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Namespaces.sdf3#core/Modules_59_71" id="core/Modules_7_19" title="Referenced at ../Namespaces.sdf3 line 6">core/Modules</a>

<span class="keyword">context-free syntax</span>

  <a href="../../NameBindingLanguage.sdf3#Module_297_303" id="Module_44_50" title="Referenced at ../../NameBindingLanguage.sdf3 line 22">Module</a>.<span class="cons_Constructor"><span id="Module_51_57" title="Not referenced locally, nor via imports">Module</span></span> = &lt;<span class="cons_String">module</span> &lt;<a href="#ModuleID_281_289" id="ModuleID_69_77" title="Defined at line 17, 19">ModuleID</a>&gt; 
    
    &lt;<a href="#ModuleSection_115_128" id="ModuleSection_90_103" title="Defined at line 9">ModuleSection</a>*&gt;&gt; 
    
  <a href="#ModuleSection_90_103" id="ModuleSection_115_128" title="Referenced at line 7">ModuleSection</a>.<span class="cons_Constructor"><span id="Imports_129_136" title="Not referenced locally, nor via imports">Imports</span></span> = &lt;
    <span class="cons_String">imports</span> &lt;<a href="#ImportModule_178_190" id="ImportModule_154_166" title="Defined at line 12, 13">ImportModule</a>*&gt;&gt; 
    
  <a href="#ImportModule_154_166" id="ImportModule_178_190" title="Referenced at line 10">ImportModule</a>.<span class="cons_Constructor"><span id="ImportWildcard_191_205" title="Not referenced locally, nor via imports">ImportWildcard</span></span> = &lt;&lt;<a href="#ModuleID_281_289" id="ModuleID_210_218" title="Defined at line 17, 19">ModuleID</a>&gt;<span class="cons_String">/-</span>&gt; 
  <a href="#ImportModule_154_166" id="ImportModule_226_238" title="Referenced at line 10">ImportModule</a>.<span class="cons_Constructor"><span id="Import_239_245" title="Not referenced locally, nor via imports">Import</span></span> = &lt;&lt;<a href="#ModuleID_281_289" id="ModuleID_250_258" title="Defined at line 17, 19">ModuleID</a>&gt;&gt; 

<span class="keyword">lexical syntax</span>

  <a href="#ModuleID_460_468" id="ModuleID_281_289" title="Referenced at line 25">ModuleID</a> = {<a href="#ModuleIDPart_315_327" id="ModuleIDPart_293_305" title="Defined at line 18">ModuleIDPart</a> <span class="cons_Lit">"/"</span>}+ 
  <a href="#ModuleIDPart_293_305" id="ModuleIDPart_315_327" title="Referenced at line 17">ModuleIDPart</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\.\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]* 
  <a href="#ModuleID_460_468" id="ModuleID_367_375" title="Referenced at line 25">ModuleID</a> = <a href="#SectionKeyword_407_421" id="SectionKeyword_378_392" title="Defined at line 21">SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <a href="#SectionKeyword_378_392" id="SectionKeyword_407_421" title="Referenced at line 19">SectionKeyword</a> = <span class="cons_Lit">"imports"</span> 

<span class="keyword">lexical restrictions</span>

  <a href="#ModuleID_281_289" id="ModuleID_460_468" title="Defined at line 17, 19">ModuleID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]

</code></pre></td></tr></tbody></table></div>