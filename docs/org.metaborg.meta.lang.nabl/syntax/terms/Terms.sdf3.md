---
title: Terms.sdf3
---

# `Terms.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Terms.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Terms.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/terms/Terms.sdf3 "The source file on GitHub"

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
38
39
40
41
42
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Vars.sdf3#terms/Terms_54_65" id="terms/Terms_7_18" title="Referenced at ../Vars.sdf3 line 6">terms/Terms</a>

<span class="keyword">imports</span> 

  <a href="../Constants.sdf3#terms/Constants_7_22" id="terms/Constants_32_47" title="Defined at ../Constants.sdf3 line 1">terms/Constants</a> 
  <a href="../../common/Identifiers.sdf3#common/Identifiers_7_25" id="common/Identifiers_51_69" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
  <a href="../Vars.sdf3#terms/Vars_7_17" id="terms/Vars_74_84" title="Defined at ../Vars.sdf3 line 1">terms/Vars</a>

<span class="keyword">sorts</span>

  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_95_102" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>

<span class="keyword">context-free syntax</span>

  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_127_134" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a> = &lt;&lt;<a href="../Vars.sdf3#Var_80_83" id="Var_139_142" title="Defined at ../Vars.sdf3 line 10, 15, 16, 17">Var</a>&gt;&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_148_155" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="Int_156_159" title="Not referenced locally, nor via imports">Int</span></span> = &lt;&lt;<a href="../Constants.sdf3#Int_34_37" id="Int_164_167" title="Defined at ../Constants.sdf3 line 5, 9">Int</a>&gt;&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_173_180" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="Real_181_185" title="Not referenced locally, nor via imports">Real</span></span> = &lt;&lt;<a href="../Constants.sdf3#Real_38_42" id="Real_190_194" title="Defined at ../Constants.sdf3 line 5, 10">Real</a>&gt;&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_200_207" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="Str_208_211" title="Not referenced locally, nor via imports">Str</span></span> = &lt;&lt;<a href="../Constants.sdf3#String_43_49" id="String_216_222" title="Defined at ../Constants.sdf3 line 5, 11">String</a>&gt;&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_228_235" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="Op_236_238" title="Not referenced locally, nor via imports">Op</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_243_245" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_95_102" id="Pattern_249_256" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_270_277" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="OpQ_278_281" title="Not referenced locally, nor via imports">OpQ</span></span> = &lt;&lt;<a href="../Constants.sdf3#String_43_49" id="String_286_292" title="Defined at ../Constants.sdf3 line 5, 11">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_95_102" id="Pattern_296_303" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_317_324" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="Char_325_329" title="Not referenced locally, nor via imports">Char</span></span> = &lt;&lt;<a href="../Constants.sdf3#Char_222_226" id="Char_334_338" title="Defined at ../Constants.sdf3 line 15, 19">Char</a>&gt;&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_344_351" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="Tuple_352_357" title="Not referenced locally, nor via imports">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Pattern_95_102" id="Pattern_364_371" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_385_392" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="List_393_397" title="Not referenced locally, nor via imports">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Pattern_95_102" id="Pattern_404_411" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_425_432" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="ListTail_433_441" title="Not referenced locally, nor via imports">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Pattern_95_102" id="Pattern_448_455" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Pattern_95_102" id="Pattern_467_474" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a>&gt;<span class="cons_String">]</span>&gt; 
  <a href="../../formulas/Propositions.sdf3#Pattern_284_291" id="Pattern_481_488" title="Referenced at ../../formulas/Propositions.sdf3 line 17; ../../NameBindingLanguage.sdf3 line 153; line 25">Pattern</a>.<span class="cons_Constructor"><span id="As_489_491" title="Not referenced locally, nor via imports">As</span></span> = &lt;&lt;<a href="../Vars.sdf3#Var_80_83" id="Var_496_499" title="Defined at ../Vars.sdf3 line 10, 15, 16, 17">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Pattern_95_102" id="Pattern_502_509" title="Defined at line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a>&gt;&gt; 

<span class="keyword">sorts</span>

  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_523_527" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>

<span class="keyword">context-free syntax</span>

  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_552_556" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a> = &lt;&lt;<a href="../Vars.sdf3#VarRef_84_90" id="VarRef_561_567" title="Defined at ../Vars.sdf3 line 10, 18, 19">VarRef</a>&gt;&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_573_577" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="Int_578_581" title="Not referenced locally, nor via imports">Int</span></span> = &lt;&lt;<a href="../Constants.sdf3#Int_34_37" id="Int_586_589" title="Defined at ../Constants.sdf3 line 5, 9">Int</a>&gt;&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_595_599" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="Real_600_604" title="Not referenced locally, nor via imports">Real</span></span> = &lt;&lt;<a href="../Constants.sdf3#Real_38_42" id="Real_609_613" title="Defined at ../Constants.sdf3 line 5, 10">Real</a>&gt;&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_619_623" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="Str_624_627" title="Not referenced locally, nor via imports">Str</span></span> = &lt;&lt;<a href="../Constants.sdf3#String_43_49" id="String_632_638" title="Defined at ../Constants.sdf3 line 5, 11">String</a>&gt;&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_644_648" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="Op_649_651" title="Not referenced locally, nor via imports">Op</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_656_658" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_523_527" id="Term_662_666" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_680_684" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="OpQ_685_688" title="Not referenced locally, nor via imports">OpQ</span></span> = &lt;&lt;<a href="../Constants.sdf3#String_43_49" id="String_693_699" title="Defined at ../Constants.sdf3 line 5, 11">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_523_527" id="Term_703_707" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_721_725" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="Char_726_730" title="Not referenced locally, nor via imports">Char</span></span> = &lt;&lt;<a href="../Constants.sdf3#Char_222_226" id="Char_735_739" title="Defined at ../Constants.sdf3 line 15, 19">Char</a>&gt;&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_745_749" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="Tuple_750_755" title="Not referenced locally, nor via imports">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_523_527" id="Term_762_766" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_780_784" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="List_785_789" title="Not referenced locally, nor via imports">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_523_527" id="Term_796_800" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt; 
  <a href="../../formulas/Messages.sdf3#Term_117_121" id="Term_814_818" title="Referenced at ../../formulas/Messages.sdf3 line 9; ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 137; ../StringQuotations.sdf3 line 49; line 42">Term</a>.<span class="cons_Constructor"><span id="ListTail_819_827" title="Not referenced locally, nor via imports">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_523_527" id="Term_834_838" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Term_523_527" id="Term_850_854" title="Defined at line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;<span class="cons_String">]</span>&gt; 

</code></pre></td></tr></tbody></table></div>