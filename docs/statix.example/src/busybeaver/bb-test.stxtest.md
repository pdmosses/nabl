---
title: bb-test.stxtest
hide:
  - toc
---

# `bb-test.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/busybeaver/bb-test.stxtest]

[pdmosses/nabl/statix.example/src/busybeaver/bb-test.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/busybeaver/bb-test.stxtest "The source file on GitHub"

<div class="stxtest"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="token layout">// 3-state Busy Beaver Turing machine specification</span>
<span class="token layout">// https://en.wikipedia.org/wiki/Turing_machine_examples#3-state_Busy_Beaver</span>

<span class="token keyword">resolve</span>

  <a href="../bb-rules.stx#busybeaver_197_207" id="busybeaver_141_151" title="Defined at ../bb-rules.stx line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#A_198_199" id="A_152_153" title="Defined at ../bb-sig.stx line 9"><span class="token sort_OpId">A</span></a>(), ([], <a href="../bb-sig.stx#Zero_295_299" id="Zero_162_166" title="Defined at ../bb-sig.stx line 15"><span class="token sort_OpId">Zero</span></a>(), []))

<span class="token keyword">imports</span>

  <a href="../bb-sig.stx#busybeaver/bb-sig_137_154" id="busybeaver/bb-sig_187_204" title="Defined at ../bb-sig.stx line 4"><span class="token sort_ConstraintId">busybeaver</span>/<span class="token sort_ConstraintId">bb</span>-<span class="token sort_ConstraintId">sig</span></a>
  <a href="../bb-rules.stx#busybeaver/bb-rules_137_156" id="busybeaver/bb-rules_207_226" title="Defined at ../bb-rules.stx line 4"><span class="token sort_ConstraintId">busybeaver</span>/<span class="token sort_ConstraintId">bb</span>-<span class="token keyword">rules</span></a>

</code></pre></td></tr></tbody></table></div>