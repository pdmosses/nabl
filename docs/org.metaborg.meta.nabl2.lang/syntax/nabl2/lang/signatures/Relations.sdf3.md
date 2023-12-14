---
title: Relations.sdf3
hide:
  - toc
---

# `Relations.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Relations.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3/#nabl2/lang/signatures/Relations_9_3" id="nabl2/lang/signatures/Relations_1_8" title="Referenced at ../Signature.sdf3 line 9">nabl2/lang/signatures/Relations</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/Relations</span>
  <span title="External reference">nabl2/shared/common/Sorts</span>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_15_3" title="Not referenced">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Relations_15_19" title="Not referenced">Relations</span></span> = &lt;
    <span class="cons_String">relations</span>
      &lt;{<a href="#NaBL2-RelationDef_22_3" id="NaBL2-RelationDef_17_9" title="Defined at line 22">NaBL2-RelationDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-RelationDef_17_9" id="NaBL2-RelationDef_22_3" title="Referenced at line 17">NaBL2-RelationDef</a>.<span class="cons_Constructor"><span id="RelationDef_22_21" title="Not referenced">RelationDef</span></span> = &lt;&lt;{<a href="#NaBL2-RelationOption_24_3" id="NaBL2-RelationOption_22_38" title="Defined at line 24, 25, 26">NaBL2-RelationOption</a> <span class="cons_Lit">", "</span>}*&gt; &lt;<span title="External reference">NaBL2-Relation</span>&gt; &lt;<a href="#NaBL2-RelationType_28_3" id="NaBL2-RelationType_22_85" title="Defined at line 28">NaBL2-RelationType</a>&gt; &lt;<a href="#NaBL2-VariancePatterns_30_3" id="NaBL2-VariancePatterns_22_106" title="Defined at line 30, 31">NaBL2-VariancePatterns</a>&gt;&gt;

  <a href="#NaBL2-RelationOption_22_38" id="NaBL2-RelationOption_24_3" title="Referenced at line 22">NaBL2-RelationOption</a> = <span title="External reference">NaBL2-Reflexivity</span>
  <a href="#NaBL2-RelationOption_22_38" id="NaBL2-RelationOption_25_3" title="Referenced at line 22">NaBL2-RelationOption</a> = <span title="External reference">NaBL2-Symmetry</span>
  <a href="#NaBL2-RelationOption_22_38" id="NaBL2-RelationOption_26_3" title="Referenced at line 22">NaBL2-RelationOption</a> = <span title="External reference">NaBL2-Transitivity</span>

  <a href="#NaBL2-RelationType_22_85" id="NaBL2-RelationType_28_3" title="Referenced at line 22">NaBL2-RelationType</a> = &lt;<span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-SortRef</span>&gt; <span class="cons_String">*</span> &lt;<span title="External reference">NaBL2-SortRef</span>&gt;&gt;

  <a href="#NaBL2-VariancePatterns_22_106" id="NaBL2-VariancePatterns_30_3" title="Referenced at line 22">NaBL2-VariancePatterns</a>      = &lt;<span class="cons_String">{</span> &lt;{<span title="External reference">NaBL2-VariancePattern</span> <span class="cons_Lit">",\n"</span>}*&gt; <span class="cons_String">}</span>&gt;
  <a href="#NaBL2-VariancePatterns_22_106" id="NaBL2-VariancePatterns_31_3" title="Referenced at line 22">NaBL2-VariancePatterns</a>      = {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"[]"</span>)}
 
 <span class="keyword">lexical syntax</span>
 
  <span id="NaBL2-Keyword_35_3" title="Not referenced">NaBL2-Keyword</span> = <span class="cons_Lit">"relations"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
