---
title: bb-sig.stx
hide:
  - toc
---

# `bb-sig.stx`

:simple-github: [pdmosses/nabl/statix.example/src/busybeaver/bb-sig.stx]

[pdmosses/nabl/statix.example/src/busybeaver/bb-sig.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/busybeaver/bb-sig.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="layout">// 3-state Busy Beaver Turing machine specification</span>
<span class="layout">// https://en.wikipedia.org/wiki/Turing_machine_examples#3-state_Busy_Beaver</span>

<span class="keyword">module</span> <a href="../bb-rules.stx/#busybeaver/bb-sig_169_186" id="busybeaver/bb-sig_137_154" title="Referenced at ../bb-rules.stx line 8; ../bb-test.stxtest line 10"><span class="token sort_ConstraintId">busybeaver</span><span class="operator">/</span><span class="token sort_ConstraintId">bb</span><span class="operator">-</span><span class="token sort_ConstraintId">sig</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#State_205_210" id="State_175_180" title="Referenced at line 9, 10, 11, 12; ../bb-rules.stx line 12"><span class="token sort_OpId">State</span></a></span> <span class="keyword">constructors</span>
    <a href="../bb-rules.stx/#A_237_238" id="A_198_199" title="Referenced at ../bb-rules.stx line 14, 17, 21; ../bb-test.stxtest line 6"><span class="token sort_OpId">A</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_175_180" id="State_205_210" title="Defined at line 8"><span class="token sort_OpId">State</span></a></span>
    <a href="../bb-rules.stx/#B_283_284" id="B_215_216" title="Referenced at ../bb-rules.stx line 15, 20, 23, 24, 27"><span class="token sort_OpId">B</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_175_180" id="State_222_227" title="Defined at line 8"><span class="token sort_OpId">State</span></a></span>
    <a href="../bb-rules.stx/#C_381_382" id="C_232_233" title="Referenced at ../bb-rules.stx line 18, 26, 29"><span class="token sort_OpId">C</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_175_180" id="State_239_244" title="Defined at line 8"><span class="token sort_OpId">State</span></a></span>
    <a href="../bb-rules.stx/#HALT_775_779" id="HALT_249_253" title="Referenced at ../bb-rules.stx line 30, 32"><span class="token sort_OpId">HALT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_175_180" id="State_256_261" title="Defined at line 8"><span class="token sort_OpId">State</span></a></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Symbol_302_308" id="Symbol_271_277" title="Referenced at line 15, 16, 23, 23, 23"><span class="token sort_OpId">Symbol</span></a></span> <span class="keyword">constructors</span>
    <a href="../bb-rules.stx/#Zero_249_253" id="Zero_295_299" title="Referenced at ../bb-rules.stx line 14, 20, 26, 40, 44; ../bb-test.stxtest line 6"><span class="token sort_OpId">Zero</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Symbol_271_277" id="Symbol_302_308" title="Defined at line 14"><span class="token sort_OpId">Symbol</span></a></span>
    <a href="../bb-rules.stx/#One_300_303" id="One_313_316" title="Referenced at ../bb-rules.stx line 15, 17, 18, 21, 23, 24, 27, 29, 30"><span class="token sort_OpId">One</span></a>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Symbol_271_277" id="Symbol_320_326" title="Defined at line 14"><span class="token sort_OpId">Symbol</span></a></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Move_362_366" id="Move_336_340" title="Referenced at line 19, 20, 21; ../bb-rules.stx line 36"><span class="token sort_OpId">Move</span></a></span> <span class="keyword">constructors</span>
    <a href="../bb-rules.stx/#R_315_316" id="R_358_359" title="Referenced at ../bb-rules.stx line 15, 30, 38, 40"><span class="token sort_OpId">R</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_336_340" id="Move_362_366" title="Defined at line 18"><span class="token sort_OpId">Move</span></a></span>
    <a href="../bb-rules.stx/#L_413_414" id="L_371_372" title="Referenced at ../bb-rules.stx line 18, 21, 24, 27, 42, 44"><span class="token sort_OpId">L</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_336_340" id="Move_375_379" title="Defined at line 18"><span class="token sort_OpId">Move</span></a></span>
    <a href="../bb-rules.stx/#N_1138_1139" id="N_384_385" title="Referenced at ../bb-rules.stx line 46"><span class="token sort_OpId">N</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_336_340" id="Move_388_392" title="Defined at line 18"><span class="token sort_OpId">Move</span></a></span>

  <span class="keyword">sorts</span> <a href="../bb-rules.stx/#Tape_218_222" id="Tape_402_406" title="Referenced at ../bb-rules.stx line 12, 36, 36"><span class="token sort_OpId">Tape</span></a> <span class="operator">=</span> <span class="operator">(</span><span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Symbol_271_277" id="Symbol_415_421" title="Defined at line 14"><span class="token sort_OpId">Symbol</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Symbol_271_277" id="Symbol_425_431" title="Defined at line 14"><span class="token sort_OpId">Symbol</span></a></span> <span class="operator">*</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Symbol_271_277" id="Symbol_439_445" title="Defined at line 14"><span class="token sort_OpId">Symbol</span></a></span><span class="operator">))</span>
  
</code></pre></td></tr></tbody></table></div>