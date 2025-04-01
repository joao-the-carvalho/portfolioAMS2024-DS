import pygame
import os
pygame.init()
cor = (219, 217, 138)
tela = pygame.display.set_mode((500,400))
tela.fill(cor)
pygame.display.flip()
pygame.display.set_caption('Olá, Mundo!')
running = True


while running:
    for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

quit()