Write-Host "========================================" -ForegroundColor Green
Write-Host "   LIMPIANDO PROYECTO SPACE INVADERS" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green
Write-Host ""

# Limpiar directorio bin
if (Test-Path "bin") {
    Write-Host "Eliminando directorio bin..." -ForegroundColor Yellow
    Remove-Item -Recurse -Force "bin"
    Write-Host "Directorio bin eliminado." -ForegroundColor Green
} else {
    Write-Host "Directorio bin no existe." -ForegroundColor Yellow
}

# Limpiar directorio target (Maven)
if (Test-Path "target") {
    Write-Host "Eliminando directorio target..." -ForegroundColor Yellow
    Remove-Item -Recurse -Force "target"
    Write-Host "Directorio target eliminado." -ForegroundColor Green
} else {
    Write-Host "Directorio target no existe." -ForegroundColor Yellow
}

Write-Host ""
Write-Host "Limpieza completada!" -ForegroundColor Green
Write-Host ""
Write-Host "Presiona Enter para salir..." -ForegroundColor Cyan
Read-Host 