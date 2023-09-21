---
title: Relations.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3#nabl2/lang/signatures/Relations_190_221" id="nabl2/lang/signatures/Relations_7_38" title="Referenced at ../Signature.sdf3 line 9">nabl2/lang/signatures/Relations</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>
  <span title="External reference">nabl2/shared/common/Relations</span>
  <span title="External reference">nabl2/shared/common/Sorts</span>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_216_231" title="Not referenced locally, nor via imports">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Relations_232_241" title="Not referenced locally, nor via imports">Relations</span></span> = &lt;
    <span class="cons_String">relations</span>
      &lt;{<a href="#NaBL2-RelationDef_340_357" id="NaBL2-RelationDef_268_285" title="Defined at line 22">NaBL2-RelationDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-RelationDef_268_285" id="NaBL2-RelationDef_340_357" title="Referenced at line 17">NaBL2-RelationDef</a>.<span class="cons_Constructor"><span id="RelationDef_358_369" title="Not referenced locally, nor via imports">RelationDef</span></span> = &lt;&lt;{<a href="#NaBL2-RelationOption_471_491" id="NaBL2-RelationOption_375_395" title="Defined at line 24, 25, 26">NaBL2-RelationOption</a> <span class="cons_Lit">", "</span>}*&gt; &lt;<span class="keyword">N</span>aBL2-Relation&gt; &lt;<span class="keyword">N</span><a href="#NaBL2-RelationType_599_617" id="NaBL2-RelationType_422_440" title="Defined at line 28">aBL2-RelationType&gt;</a> &lt;<span class="keyword">N</span><a href="#NaBL2-VariancePatterns_661_683" id="NaBL2-VariancePatterns_443_465" title="Defined at line 30, 31">aBL2-VariancePatterns&gt;</a>&gt;

  <span class="keyword">N</span><a href="#NaBL2-RelationOption_375_395" id="NaBL2-RelationOption_471_491" title="Referenced at line 22">aBL2-RelationOption </a>= <span class="keyword">N</span><span class="keyword">aBL</span>2-Reflexivity
  N<span class="keyword">aBL</span><a href="#NaBL2-RelationOption_375_395" id="NaBL2-RelationOption_514_534" title="Referenced at line 22">2-RelationOption = N</a><span class="keyword">aBL</span>2-<span class="keyword">S</span>ymmetry
  NaBL2-<span class="keyword">R</span><a href="#NaBL2-RelationOption_375_395" id="NaBL2-RelationOption_554_574" title="Referenced at line 22">elationOption = NaBL</a>2-<span class="keyword">T</span><span class="keyword">ran</span>sitivity

  NaBL2-<span class="keyword">Rela</span><a href="#NaBL2-RelationType_422_440" id="NaBL2-RelationType_599_617" title="Referenced at line 22">tionType = &lt;: &lt;NaB</a><span class="keyword">L</span>2-<span class="keyword">S</span><span class="cons_String">o</span>r<span class="keyword">t</span><span class="keyword">R</span>ef&gt; * &lt;NaBL2-<span class="keyword">S</span>o<span class="cons_String">r</span>t<span class="keyword">R</span><span class="keyword">e</span>f&gt;&gt;

  NaBL2-<span class="keyword">Varian</span><a href="#NaBL2-VariancePatterns_443_465" id="NaBL2-VariancePatterns_661_683" title="Referenced at line 22">cePatterns      = &lt;{ &lt;</a>{<span class="keyword">NaBL</span>2-<span class="keyword">Va</span><span class="cons_String">r</span>i<span class="keyword">an</span><span class="keyword">ce</span>Pattern ",\n"}*&gt; }&gt;
  <span class="cons_Lit">NaBL2</span>-<span class="keyword">Va</span>r<span class="cons_String">i</span><span class="keyword">ance</span><a href="#NaBL2-VariancePatterns_443_465" id="NaBL2-VariancePatterns_732_754" title="Referenced at line 22">Patterns      = {ast("</a>[]")}
 
 <span class="cons_Unquoted">lex</span><span class="keyword">i</span><span class="cons_Quoted">cal </span><span class="keyword">syntax</span>
 
  <span class="keyword">NaBL</span>2-<span class="keyword">Keyword</span> <span id="NaBL2-Keyword_796_809" title="Not referenced locally, nor via imports">= "relations"</span>
</code></pre></td></tr></tbody></table></div>