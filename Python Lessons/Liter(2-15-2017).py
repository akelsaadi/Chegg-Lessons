

iron_density = 7.8
air_density = 0.0012
gasoline_density = 0.67
ice_density = 0.9
human_body_density = 1.03
silver_density = 10.5
platinum_density = 21.4

liter = 1000  # Units of cm^3

print 'One liter of iron weighs {ir:g} grams'\
    .format(ir=iron_density * liter)
print 'One liter of air weighs {ai:g} grams'\
    .format(ai=air_density * liter)
print 'One liter of gasoline weighs {ga:g} grams'\
    .format(ga=gasoline_density * liter)
print 'One liter of ice weighs {ic:g} grams'\
    .format(ic=ice_density * liter)
print 'One liter of human body weighs {hu:g} grams'\
    .format(hu=human_body_density * liter)
print 'One liter of silver weighs {si:g} grams'\
    .format(si=silver_density * liter)
print 'One liter of platinum weighs {pl:g} grams'\
    .format(pl=platinum_density * liter)

