---
title: Functions.sdf3
hide:
  - toc
---

# `Functions.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Functions.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Functions.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/Functions.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3#nabl2/lang/signatures/Functions_117_148" id="nabl2/lang/signatures/Functions_7_38" title="Referenced at ../Signature.sdf3 line 7">nabl2/lang/signatures/Functions</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/Functions</span>
  <span title="External reference">nabl2/shared/common/Sorts</span>
  <a href="../../common/CTerms.sdf3#nabl2/lang/common/CTerms_7_31" id="nabl2/lang/common/CTerms_145_169" title="Defined at ../../common/CTerms.sdf3 line 1">nabl2/lang/common/CTerms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

<span class="keyword">context-free syntax</span>

  <a href="../Signature.sdf3#NaBL2-Signature_349_364" id="NaBL2-Signature_243_258" title="Referenced at ../Signature.sdf3 line 19">NaBL2-Signature</a>.<span class="cons_Constructor"><span id="Functions_259_268" title="Not referenced locally, nor via imports">Functions</span></span> = &lt;
    <span class="cons_String">functions</span>
      &lt;{<a href="#NaBL2-FunctionDef_367_384" id="NaBL2-FunctionDef_295_312" title="Defined at line 23">NaBL2-FunctionDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-FunctionDef_295_312" id="NaBL2-FunctionDef_367_384" title="Referenced at line 18">NaBL2-FunctionDef</a>.<span class="cons_Constructor"><span id="FunctionDef_385_396" title="Not referenced locally, nor via imports">FunctionDef</span></span> = &lt;&lt;<span title="External reference">NaBL2-Function</span>&gt; &lt;<a href="#NaBL2-FunctionType_464_482" id="NaBL2-FunctionType_418_436" title="Defined at line 25">NaBL2-FunctionType</a>&gt; &lt;<a href="#NaBL2-FunctionCases_528_547" id="NaBL2-FunctionCases_439_458" title="Defined at line 27, 31">NaBL2-FunctionCases</a>&gt;&gt;

  <a href="#NaBL2-FunctionType_418_436" id="NaBL2-FunctionType_464_482" title="Referenced at line 23">NaBL2-FunctionType</a>  = [<span class="cons_String">:</span> [<span title="External reference">NaBL2-SortRef</span>] <span class="cons_String">-&gt;</span> [<span title="External reference">NaBL2-SortRef</span>]]

  <a href="#NaBL2-FunctionCases_439_458" id="NaBL2-FunctionCases_528_547" title="Referenced at line 23">NaBL2-FunctionCases</a> = &lt;
    <span class="cons_String">{</span> &lt;{<a href="#NaBL2-FunctionCase_638_656" id="NaBL2-FunctionCase_560_578" title="Defined at line 33">NaBL2-FunctionCase</a> <span class="cons_Lit">",\n"</span>}*&gt;
    <span class="cons_String">}</span>
  &gt;
  <a href="#NaBL2-FunctionCases_439_458" id="NaBL2-FunctionCases_600_619" title="Referenced at line 23">NaBL2-FunctionCases</a> = {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"[]"</span>)}
 
  <a href="#NaBL2-FunctionCase_560_578" id="NaBL2-FunctionCase_638_656" title="Referenced at line 28">NaBL2-FunctionCase</a>  = [[<a href="../../common/CTerms.sdf3#NaBL2-CTerm_359_370" id="NaBL2-CTerm_662_673" title="Defined at ../../common/CTerms.sdf3 line 23, 27, 29, 30">NaBL2-CTerm</a>] <span class="cons_String">-&gt;</span> [<a href="../../common/CTerms.sdf3#NaBL2-CTerm_359_370" id="NaBL2-CTerm_679_690" title="Defined at ../../common/CTerms.sdf3 line 23, 27, 29, 30">NaBL2-CTerm</a>]]

<span class="keyword">lexical syntax</span>

  <span id="NaBL2-SectionKeyword_712_732" title="Not referenced locally, nor via imports">NaBL2-SectionKeyword</span> = <span class="cons_Lit">"functions"</span>

</code></pre></td></tr></tbody></table></div>