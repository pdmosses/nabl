---
title: Terms.sdf3
hide:
  - toc
---

# `Terms.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Terms.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Terms.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/common/Terms.sdf3 "The source file on GitHub"

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
43
44
45
46
47
48
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../rules/CGen.sdf3#nabl2/lang/common/Terms_201_224" id="nabl2/lang/common/Terms_7_30" title="Referenced at ../../rules/CGen.sdf3 line 11">nabl2/lang/common/Terms</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Identifiers</span>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-Var_514_523" id="NaBL2-Var_146_155" title="Referenced at line 23; ../Injections.sdf3 line 41; ../../rules/CGen.sdf3 line 38">NaBL2-Var</a>.<span class="cons_Constructor"><span id="Var_156_159" title="Not referenced locally, nor via imports">Var</span></span>   = <span title="External reference">NaBL2-VarId</span>
  <a href="#NaBL2-Wld_251_260" id="NaBL2-Wld_178_187" title="Referenced at line 17">NaBL2-Wld</a>.<span class="cons_Constructor"><span id="Wld_188_191" title="Not referenced locally, nor via imports">Wld</span></span>   = <span class="cons_Lit">"_"</span>

  <a href="#NaBL2-VarOrWld_289_303" id="NaBL2-VarOrWld_203_217" title="Referenced at line 19; ../../rules/CGen.sdf3 line 47">NaBL2-VarOrWld</a>  = <a href="#NaBL2-Var_146_155" id="NaBL2-Var_221_230" title="Defined at line 13">NaBL2-Var</a>
  <a href="#NaBL2-VarOrWld_289_303" id="NaBL2-VarOrWld_233_247" title="Referenced at line 19; ../../rules/CGen.sdf3 line 47">NaBL2-VarOrWld</a>  = <a href="#NaBL2-Wld_178_187" id="NaBL2-Wld_251_260" title="Defined at line 14">NaBL2-Wld</a>

  <a href="#NaBL2-Pattern_698_711" id="NaBL2-Pattern_264_277" title="Referenced at line 28; ../../rules/CGen.sdf3 line 32">NaBL2-Pattern</a>          = <a href="#NaBL2-VarOrWld_203_217" id="NaBL2-VarOrWld_289_303" title="Defined at line 16, 17">NaBL2-VarOrWld</a>
  <a href="#NaBL2-Pattern_698_711" id="NaBL2-Pattern_306_319" title="Referenced at line 28; ../../rules/CGen.sdf3 line 32">NaBL2-Pattern</a>.<span class="cons_Constructor"><span id="List_320_324" title="Not referenced locally, nor via imports">List</span></span>     = &lt;<span class="cons_String">[</span>&lt;{<a href="#NaBL2-Pattern_264_277" id="NaBL2-Pattern_335_348" title="Defined at line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt;
  <a href="#NaBL2-Pattern_698_711" id="NaBL2-Pattern_361_374" title="Referenced at line 28; ../../rules/CGen.sdf3 line 32">NaBL2-Pattern</a>.<span class="cons_Constructor"><span id="ListTail_375_383" title="Not referenced locally, nor via imports">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#NaBL2-Pattern_264_277" id="NaBL2-Pattern_390_403" title="Defined at line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;<a href="#NaBL2-Pattern_264_277" id="NaBL2-Pattern_413_426" title="Defined at line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a>&gt;<span class="cons_String">]</span>&gt;
  <a href="#NaBL2-Pattern_698_711" id="NaBL2-Pattern_432_445" title="Referenced at line 28; ../../rules/CGen.sdf3 line 32">NaBL2-Pattern</a>.<span class="cons_Constructor"><span id="Tuple_446_451" title="Not referenced locally, nor via imports">Tuple</span></span>    = &lt;<span class="cons_String">(</span>&lt;{<a href="#NaBL2-Pattern_264_277" id="NaBL2-Pattern_461_474" title="Defined at line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#NaBL2-Pattern_698_711" id="NaBL2-Pattern_487_500" title="Referenced at line 28; ../../rules/CGen.sdf3 line 32">NaBL2-Pattern</a>.<span class="cons_Constructor"><span id="As_501_503" title="Not referenced locally, nor via imports">As</span></span>       = &lt;&lt;<a href="#NaBL2-Var_146_155" id="NaBL2-Var_514_523" title="Defined at line 13">NaBL2-Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#NaBL2-Pattern_264_277" id="NaBL2-Pattern_526_539" title="Defined at line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a>&gt;&gt;
  <a href="#NaBL2-Pattern_698_711" id="NaBL2-Pattern_544_557" title="Referenced at line 28; ../../rules/CGen.sdf3 line 32">NaBL2-Pattern</a>          = <a href="#NaBL2-OpTerm_787_799" id="NaBL2-OpTerm_569_581" title="Defined at line 36">NaBL2-OpTerm</a>
  <a href="#NaBL2-Pattern_698_711" id="NaBL2-Pattern_584_597" title="Referenced at line 28; ../../rules/CGen.sdf3 line 32">NaBL2-Pattern</a>          = <a href="#NaBL2-IntTerm_745_758" id="NaBL2-IntTerm_609_622" title="Defined at line 32">NaBL2-IntTerm</a>
  <a href="#NaBL2-Pattern_698_711" id="NaBL2-Pattern_625_638" title="Referenced at line 28; ../../rules/CGen.sdf3 line 32">NaBL2-Pattern</a>          = <a href="#NaBL2-StringTerm_880_896" id="NaBL2-StringTerm_650_666" title="Defined at line 38">NaBL2-StringTerm</a>

  <a href="#NaBL2-Patterns_843_857" id="NaBL2-Patterns_670_684" title="Referenced at line 36">NaBL2-Patterns</a>         = &lt;&lt;{<a href="#NaBL2-Pattern_264_277" id="NaBL2-Pattern_698_711" title="Defined at line 19, 20, 21, 22, 23, 24, 25, 26">NaBL2-Pattern</a> <span class="cons_Lit">", "</span>}*&gt;&gt;

<span class="keyword">context-free syntax</span>

  <a href="#NaBL2-IntTerm_609_622" id="NaBL2-IntTerm_745_758" title="Referenced at line 25; ../CTerms.sdf3 line 29">NaBL2-IntTerm</a>.<span class="cons_Constructor"><span id="Int_759_762" title="Not referenced locally, nor via imports">Int</span></span> = <span title="External reference">NaBL2-INT</span>

<span class="keyword">syntax</span>
 
  <a href="#NaBL2-OpTerm_569_581" id="NaBL2-OpTerm_787_799" title="Referenced at line 24">NaBL2-OpTerm</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Op_803_805" title="Not referenced locally, nor via imports">Op</span></span>      = <span title="External reference">NaBL2-OpId</span><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#NaBL2-Patterns_670_684" id="NaBL2-Patterns_843_857" title="Defined at line 28">NaBL2-Patterns</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span>  <span class="cons_Lit">")"</span>

  <a href="#NaBL2-StringTerm_650_666" id="NaBL2-StringTerm_880_896" title="Referenced at line 26; ../CTerms.sdf3 line 30; ../Messages.sdf3 line 19">NaBL2-StringTerm</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Str_900_903" title="Not referenced locally, nor via imports">Str</span></span> = <span class="cons_Lit">"\""</span> <a href="#NaBL2-StringChars_958_975" id="NaBL2-StringChars_911_928" title="Defined at line 42">NaBL2-StringChars</a><span class="keyword">-LEX</span> <span class="cons_Lit">"\""</span>
 
<span class="keyword">lexical syntax</span>

  <a href="#NaBL2-StringChars_1126_1143" id="NaBL2-StringChars_958_975" title="Referenced at line 48">NaBL2-StringChars</a>   = <a href="#NaBL2-StringChar_1000_1016" id="NaBL2-StringChar_980_996" title="Defined at line 43, 44">NaBL2-StringChar</a>*
  <a href="#NaBL2-StringChar_980_996" id="NaBL2-StringChar_1000_1016" title="Referenced at line 42">NaBL2-StringChar</a>    = ~[\"\\\t\r\n]
  <a href="#NaBL2-StringChar_980_996" id="NaBL2-StringChar_1038_1054" title="Referenced at line 42">NaBL2-StringChar</a>    =  <span class="cons_Lit">"\\\""</span> | <span class="cons_Lit">"\\\\"</span> | <span class="cons_Lit">"\\t"</span> | <span class="cons_Lit">"\\r"</span> | <span class="cons_Lit">"\\n"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#NaBL2-StringChars_958_975" id="NaBL2-StringChars_1126_1143" title="Defined at line 42">NaBL2-StringChars</a> -/- ~[\"]


</code></pre></td></tr></tbody></table></div>