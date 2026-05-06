# watch-plat-image-pipe

`watch-plat-image-pipe` keeps a focused Java implementation around platform engineering. The project goal is to package a Java local lab for image analysis with capacity fixtures, allocation and spill reports, and documented operating limits.

## Project Rationale

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Watch Plat Image Pipe Review Notes

Start with `rollout width` and `rollout width`. Those cases create the widest score spread in this repo, so they are the best quick check when the model changes.

## Feature Set

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/watch-plat-image-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `rollout width` and `rollout width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `rollout width`, `quota pressure`, `route drift`, and `secret scope`.

The added Java path is deliberately direct, with fixtures doing most of the explaining.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Test Command

The verifier is intentionally local. It should fail if the fixture score math, lane assignment, or language-specific test drifts.

## Next Improvements

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
