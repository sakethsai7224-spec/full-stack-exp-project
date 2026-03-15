# static/

This folder is where the React production build files go.

## Steps to populate this folder:

1. Go to your frontend project directory
2. Run: `npm run build`
3. Copy ALL contents from `frontend/dist/` into this folder
4. Restart the Spring Boot application
5. Open http://localhost:8080 — React UI will load from here

## After copying, this folder should contain:
- index.html
- assets/ (JS, CSS bundles)
- Any other static assets (images, icons, etc.)
