Introducción

Diversos países han implementado sistemas avanzados para simular procesos complejos,
como el monitoreo de recursos naturales, la gestión de políticas públicas o el diseño de
estrategias para enfrentar retos específicos, estas simulaciones son herramientas clave para
producir información confiable que facilite la toma de decisiones en sectores críticos, como la
conservación ambiental, el manejo sostenible de recursos y la planificación económica.
En el ámbito de los ecosistemas forestales, por ejemplo, las simulaciones han permitido
comprender fenómenos como la deforestación, la degradación y las emisiones de carbono
asociadas. En México, instituciones como la Comisión Nacional Forestal (CONAFOR) han
desarrollado sistemas robustos que combinan datos de campo, herramientas de percepción
remota y modelado matemático para generar análisis detallados de los cambios en la
cobertura forestal.
Inspirándonos en este enfoque, nuestra simulación tiene como objetivo principal explorar y
analizar la porblematica que existe entorno a la deforestacion y como su explotacion
desmedida nos afecta a todos y asi poder crear futuras medidas que nos ayuden a disminuir
las cifras de deforestacion ya que los arboles son un pilar muy importante en nuestra
supervivencia. Utilizando un modelo que integra datos dinámicos y representaciones visuales,
buscamos ofrecer una herramienta para predecir, visualizar y entender patrones relevantes
para la sostenibilidad de los recursos.
El diseño de nuestra simulación se fundamenta en componentes clave, tales como el modelo
matemático, el sistema visual permitiendo un mejor entendimiento de los datos. Estos
elementos nos permitirán analizar no solo los resultados de cada escenario simulado, sino
también los márgenes de incertidumbre y las implicaciones prácticas para la implementación
de políticas o estrategias.
Al igual que los sistemas nacionales de monitoreo forestal adoptados por países como México
en el cual basamos nuestros datos, nuestra simulación adopta un enfoque metodológico que
combina precisión técnica con accesibilidad práctica. Esto incluye el uso de gráficos, análisis
de datos . En este sentido, nuestra propuesta busca ser no solo una herramienta de análisis,
sino también una guía para la acción informada de todos los mexicanos.

Antecedentes

El desarrollo de esta simulación se basa en gran parte en el análisis realizado por Rosete-
Vergés et al. (2014), en su estudio El avance de la deforestación en México 1976-2007. Este
trabajo proporciona un análisis exhaustivo del cambio en el uso del suelo y la vegetación en
México durante el periodo 1976-2007, utilizando datos del INEGI y el Inventario Nacional
Forestal. Los resultados mostraron que la tasa de deforestación anual fue de 534,707
hectáreas, subrayando la importancia de integrar los procesos de recuperación de vegetación
secundaria en las estimaciones de deforestación. Este estudio no solo destaca las tasas de
deforestación, sino también las variaciones entre las diferentes etapas de tiempo y las
implicaciones del uso de la tierra para la agricultura, lo que ha influido en el enfoque
metodológico adoptado en nuestra simulación para proyectar escenarios futuros relacionados
con la deforestación.

Objetivo general

Estimar la tasa de deforestación bruta anual de México para el periodo a simular , todo esto
mediante el método de regresión lineal predictiva y simulación de estadística.

Alcances de la estimación

En este apartado se describe el alcance de la estimación de datos simulados en relación con la
deforestación anual, incertidumbre, límites inferior y superior, entre otros indicadores clave.
Este análisis considera únicamente datos ingresados por el usuario que no pertenecen al
periodo de nuestra base de datos (2001-2022).
4.1. Definiciones clave y marco de simulación
El presente enfoque toma como base las definiciones de bosque y deforestación, adaptadas
de metodologías reconocidas como las del IPCC (2003, 2006) y el Sistema de Clasificación de
Uso del Suelo y Vegetación del INEGI. Las definiciones se han simplificado para cumplir con el
propósito de simular datos y extrapolar tendencias a partir de las entradas del usuario.
En este contexto, los datos generados simulan periodos fuera de la base original,
considerando:
• Deforestación anual simulada: basada en tasas históricas y variaciones significativas
detectadas.
• Incertidumbre y rangos de estimación: definidos mediante cálculos estadísticos que
reflejan la variabilidad de los datos históricos.

• Límites inferiores y superiores: calculados considerando márgenes de error derivados
de las simulaciones.
Limitaciones del análisis
• Periodo de validez: la simulación cubre únicamente periodos fuera del rango 2001-
2022 . Dentro de este periodo, se sugiere utilizar los datos reales de la base disponible.
• Precisión limitada: los resultados simulados se derivan de extrapolaciones y son
aproximaciones que no reemplazan datos empíricos.
• Dependencia de las entradas del usuario: la calidad y relevancia de los datos ingresados
afectan significativamente la validez de las simulaciones generadas.
Modelo matematico usado
1.- Regresión Lineal:
• Utilizas un modelo de regresión lineal para predecir valores futuros de
deforestación e incertidumbre en función de los datos históricos. Esto
corresponde a un modelo de predicción basado en una relación lineal entre
variables.
2.- Simulación de Monte Carlo controlada (fluctuaciones aleatorias):
• En la sección de simulación de fluctuaciones para años futuros, introduces
variaciones aleatorias en los valores de deforestación con límites controlados
(±3%). Este método es típico donde se utilizan valores aleatorios para simular
posibles escenarios dentro de un rango definido.
3.- Estimación de Intervalos de Confianza:
• Calculas los límites superior e inferior de la predicción utilizando el valor de
incertidumbre y un factor estadístico (zAlfa). Esto es parte de un enfoque
estadístico para representar la incertidumbre asociada a las predicciones.
4.- Proyección Temporal:
• El código proyecta datos en el tiempo, comenzando desde el último año con
datos históricos hasta un año objetivo especificado por el usuario. Esto es típico
de modelos de simulación de series temporales.

Clasificacón del Modelo

Este modelo se puede clasificar como una simulación híbrida que combina técnicas
estadísticas (regresión y estimación de intervalos) con simulación por fluctuaciones
controladas. En términos más específicos, sería un modelo predictivo-estadístico con
fluctuaciones estocásticas.
• Base del modelo: Análisis histórico y predicción de tendencias con regresión lineal.
• Simulación: Generación de escenarios futuros considerando incertidumbre y
fluctuaciones aleatorias controladas.
• Aplicación: Proyección de datos de deforestación y análisis de incertidumbre a largo
plazo.
Recopilación de datos
Para llevar a cabo el análisis de la deforestación en México y su impacto a nivel nacional se ha
recopilado información relevante de fuentes oficiales que permiten evaluar la pérdida de
cobertura forestal y sus causas.
1.- Sistema Nacional de Monitoreo Forestal (SNMF): Según el SNMF, el promedio anual de
deforestación en México en el periodo de 2001 a 2022 ha sido de aproximadamente 208,746
hectáreas por año. La principal causa de pérdida de ecosistemas forestales ha sido la
conversión de tierras forestales a pastizales, que representa un 73.84% (154,134 ha/año),
seguida de la conversión a tierras agrícolas con un 21.26% (44,379 ha/año), y otros usos con
un 2.54%. La deforestación varía según la ecorregión, destacando las Selvas Cálido-Húmedas
y las Selvas Cálido-Secas como las más afectadas, con 86,441 ha/año y 57,517 ha/año de
pérdida, respectivamente.
2.- Sistema Satelital de Monitoreo Forestal (SAMOF) de la CONAFOR: La Comisión Nacional
Forestal (CONAFOR) implementa el SAMOF, un sistema basado en la fotointerpretación de
imágenes satelitales de alta resolución para obtener estimaciones precisas de la
deforestación. En el periodo 2019-2021, la tasa anual de deforestación disminuyó un 26%,
gracias a esfuerzos de conservación y políticas públicas para reducir la pérdida de bosques. En
2021, se registró una deforestación bruta de 167,811 hectáreas, con una reducción de un
25.94% en comparación con 2019. Las causas principales de la deforestación en estos años
incluyeron la conversión de tierras forestales a praderas (87.70% en 2020 y 76.61% en 2021) y
a tierras de cultivo.
3.- Instituto Nacional de Estadística y Geografía (INEGI): El INEGI proporciona datos sobre la
variación de la vegetación primaria y secundaria en México. Las comunidades primarias
representan una superficie aproximada de 951,482.8 km² y las secundarias, 437,107.46 km²,
según los datos de 2014 ajustados a la superficie nacional. Los datos de vegetación y uso de
suelo, obtenidos de archivos vectoriales en proyección Albers Equi Area, permiten analizar los
cambios en la cobertura forestal y la distribución de distintos tipos de vegetación, como
bosques de coníferas, encinos y mesófilos.

Objetivos especificos

1.- Predicción de Comportamiento Futuro
Usando el modelo de regresión lineal, se buscará proyectar el comportamiento de los datos a
corto y mediano plazo. La regresión permitirá extrapolar los valores, generando estimaciones
basadas en las tendencias observadas en el conjunto de datos inicial. Así, se espera contar con
una herramienta predictiva que brinde un panorama sobre posibles valores futuros y la
variabilidad que podría esperarse bajo condiciones similares a las de los datos analizados.
2.- Simulación de Escenarios
A partir de las métricas de dispersión, como la varianza y el rango de los datos, se podrá
simular escenarios alternativos, considerando diferentes posibles variaciones en los valores.
Esto permitirá explorar cómo cambios en la variable independiente podrían afectar los
resultados y cómo estos ajustes se reflejan en el modelo de regresión lineal.
3.- Identificación de Patrones y Tendencias Generales
A través de la pendiente y el coeficiente de determinación (\(R^2\)) de la regresión lineal, el
análisis revelará la dirección y la fuerza de la relación entre variables, proporcionando una
visión de las tendencias generales que dominan el comportamiento de los datos. Un \(R^2\)
alto indicaría una tendencia clara que podría ser útil en la toma de decisiones, mientras que un
valor bajo sugeriría mayor variabilidad y, por lo tanto, menor predictibilidad en los datos.
4.- Evaluación de la Precisión en las Estimaciones
Al comparar las proyecciones del modelo con los valores reales, se podrá evaluar la precisión
del análisis. Este proceso de validación permitirá identificar el grado de confianza del modelo
y ajustar cualquier parámetro que mejore la precisión de las predicciones futuras.
5.- Mejora en la Toma de Decisiones Basada en Datos
Finalmente, el análisis busca ofrecer una base cuantitativa sólida para la toma de decisiones
informadas. Al entender mejor el comportamiento histórico y su potencial de cambio, será
posible evaluar el impacto de diferentes acciones o políticas y predecir cómo estas decisiones
podrían influir en el futuro de los valores estudiados.

Implementación y Resultados
Para el desarrollo de la simulación, se utilizó Java como lenguaje de programación debido a su
robustez, portabilidad y soporte extensivo para bibliotecas relacionados con el manejo de
datos, gráficos y simulaciones. Java permitió implementar modelos matemáticos complejos y
visualizar los resultados de manera eficiente.
Herramientas y Entorno de Desarrollo:
1.- Entorno de desarrollo integrado (IDE): Se utilizó NetBeans IDE, que facilita la gestión de
proyectos, la depuración y la creación de interfaces gráficas mediante su editor visual.
2.- Versión de Java: Se trabajó con la versión Openjdk 23, que ofrece mejoras en el rendimiento
y características modernas de programación.
3.- Bibliotecas utilizadas:
- Swing: Para la creación de interfaces gráficas interactivas que permitan la visualización de
datos.
- Apache Commons Math: Para manejar cálculos matemáticos avanzados, como regresión
lineal y generación de números aleatorios para simulaciones.
- JFreeChart: Para la generación de gráficos que representan los resultados de la simulación.
Proceso de Configuración:
1.- Instalación del JDK: Se descargó e instaló el Java Development Kit (JDK) desde el sitio oficial
de Oracle para garantizar la compatibilidad con el entorno de desarrollo.
2.- Configuración del IDE: En NetBeans, se creó un proyecto tipo "Java Application" y se
configuraron las dependencias necesarias para incluir las bibliotecas externas (por ejemplo,
mediante archivos ".jar").
3.- Estructura del proyecto:
- Clase principal: Contiene la estructura del proyecto que ejecuta la simulación.
- Metodos: Organizados para separar la lógica matemática, la interfaz gráfica y los
resultados.
- Archivos de recursos: Carpeta dedicada para almacenar datos de entrada y salida, como
archivos ".csv" o imágenes.
Uso de Java en el Proyecto:
El lenguaje Java fue clave en las siguientes áreas del proyecto:
- Modelado de datos: Se implementaron clases para representar las variables clave de la
simulación, como tasas de deforestación, periodos de análisis y rangos de incertidumbre.
- Algoritmos matemáticos: El modelo de regresión lineal y la simulación de Monte Carlo
fueron implementados usando estructuras y funciones de Java.
- Visualización: Con la biblioteca JFreeChart, se generaron gráficos interactivos que muestran
las predicciones y los patrones de deforestación.

- Interfaz de usuario: La interfaz gráfica fue desarrollada con Swing, permitiendo que el
usuario interactúe con la simulación, ingrese parámetros personalizados y observe los
resultados en tiempo real.
Flujo de trabajo
El flujo de trabajo de la aplicación se organiza en dos apartados principales dentro del panel
principal: Documentación y Simulación. Cada apartado proporciona funcionalidades
específicas para guiar al usuario a través del proceso de análisis y simulación de la
deforestación.
Apartado: Documentación
En esta sección, se presentan los fundamentos teóricos y los objetivos del análisis. Incluye tres
opciones principales, cada una dirigida a explicar diferentes aspectos del proyecto:
1. Explicación del modelo matemático: Detalla los conceptos y las ecuaciones utilizadas para
realizar las proyecciones y estimaciones de deforestación. Incluye una descripción del modelo
de regresión lineal simple y el método de simulación Monte Carlo.
2. Objetivos del análisis y resultados esperados: Proporciona información sobre las metas del
proyecto y las proyecciones que se buscan obtener a partir del modelo implementado.
3. Explicación del modelo de regresión lineal simple: Se describe cómo se utiliza la regresión
lineal para predecir los valores futuros de la deforestación, basándose en datos históricos y su
variación a lo largo del tiempo.
Apartado: Simulación

1. Explicación del modelo matemático: Detalla los conceptos y las ecuaciones utilizadas para
realizar las proyecciones y estimaciones de deforestación. Incluye una descripción del modelo
de regresión lineal simple y el método de simulación Monte Carlo.
2. Objetivos del análisis y resultados esperados: Proporciona información sobre las metas del
proyecto y las proyecciones que se buscan obtener a partir del modelo implementado.
3. Explicación del modelo de regresión lineal simple: Se describe cómo se utiliza la regresión
lineal para predecir los valores futuros de la deforestación, basándose en datos históricos y su
variación a lo largo del tiempo.
Apartado: Simulación
Esta sección permite al usuario realizar simulaciones personalizadas mediante dos opciones
principales para ingresar datos: manualmente o desde un archivo CSV.
1. Selección del año de inicio y duración de la simulación: El usuario selecciona el año de inicio
y especifica cuántos años desea simular. Esto define el rango de tiempo para el cual se
generarán las predicciones.

2. Ingreso manual de datos:

- Se habilita un formulario para ingresar los datos necesarios para la simulación:
- Año de inicio.
- Deforestación: Superficie deforestada en hectáreas.
- Incertidumbre: Margen de error o variabilidad en los datos.
- Alfa: Nivel de significancia para los cálculos estadísticos.
- Límite inferior: Valor mínimo estimado basado en los datos ingresados.
- Límite superior: Valor máximo estimado.
- Año de finalización de la simulación.
- Al presionar un botón, el sistema verifica si los datos ingresados ya existen en la base de
datos. Si es así, los campos se rellenan automáticamente con los valores correspondientes.
3. Carga de datos desde un archivo CSV:

- El usuario puede seleccionar un archivo CSV desde su sistema mediante un selector de
archivos.
- El archivo debe contener al menos cinco años consecutivos de datos para poder realizar la
simulación correctamente.
- Una vez cargado, los datos se procesan y se generan las predicciones basadas en el rango
de años especificado.
Esta estructura asegura una experiencia flexible y personalizable para los usuarios,
permitiéndoles ingresar datos manualmente o aprovechar archivos preexistentes para
ejecutar simulaciones precisas y adaptadas a sus necesidades.

Aspectos Clave
Uno de los métodos fundamentales para la simulación es el que permite leer y procesar datos
desde un archivo CSV, lo cual facilita la carga de información histórica o simulada en la
aplicación para su posterior análisis. A continuación se explica el funcionamiento del primer
método implementado en el proyecto:

1.-Método: leerDatosDesdeCSV(File archivo)

Este método se encarga de leer un archivo CSV (Comma Separated Values) que contiene los
datos necesarios para la simulación, y los convierte en una lista de mapas que luego serán
utilizados por el sistema. Aquí está el detalle de cómo funciona:
1. Entrada del archivo CSV:
- El archivo CSV proporcionado debe contener los datos organizados en columnas separadas
por comas. Cada fila representa un conjunto de valores asociados a un año o periodo de
simulación, con encabezados en la primera fila.
2. Lectura del archivo:
- El método usa un "BufferedReader" para leer el archivo línea por línea. Este es un enfoque
eficiente para manejar archivos grandes, ya que permite leer de manera secuencial sin cargar
todo el archivo en memoria.
3. Procesamiento de la primera línea (encabezados):
- La primera línea del archivo CSV generalmente contiene los encabezados, es decir, los
nombres de las columnas (por ejemplo, "Año", "Deforestación", "Incertidumbre", etc.).
- Esta línea se lee y se divide por comas para obtener los nombres de las columnas, que luego
se utilizarán como claves en el mapa que representará cada fila de datos.
4. Lectura de los datos:
- A continuación, el método lee cada línea del archivo (después de la primera) y la divide en
valores utilizando la coma como delimitador.
- Cada valor se asigna a su respectiva clave (encabezado) dentro de un "Map<String,
String>". Esto crea un mapa por cada fila, donde las claves son los encabezados y los valores
son los datos correspondientes de esa fila.
5. Almacenamiento de los datos:
- Los mapas generados para cada fila se agregan a una lista de mapas ("List<Map<String,
String>>"), lo que permite almacenar todos los registros del archivo de manera estructurada.
6. Excepción de manejo (IOException):
- El método está diseñado para manejar posibles excepciones de entrada/salida, como
problemas al abrir o leer el archivo, asegurando que el sistema no se bloquee ante errores
relacionados con el acceso a los archivos.
¿Qué hace este método?
- Convierte un archivo CSV en una estructura de datos organizada (una lista de mapas), donde
cada mapa representa una fila del archivo con claves basadas en los encabezados.
- Este método facilita el manejo y análisis de datos en la simulación, ya que permite cargar
información de manera rápida y eficiente desde archivos externos.
2. Método "simularDatos"

Este método realiza la simulación de los datos de deforestación para los años posteriores a los
datos históricos, basándose en un modelo de regresión lineal para predecir los valores futuros
de la deforestación y la incertidumbre.
Explicación:
- Entradas:
- "datosBase": Una lista de mapas donde cada mapa representa una fila de datos con los
valores históricos de deforestación e incertidumbre.
- "anoSimulacion": El año final hasta el cual se desea realizar la simulación.
- Proceso:
1. Extracción de datos históricos: El método comienza extrayendo los valores de los años,
deforestación e incertidumbre de los datos base.
2. Validación: Se verifica que no haya datos nulos o inconsistencias en las listas de valores.
3. Modelo de regresión lineal: Se crean dos modelos de regresión lineal: uno para la
deforestación y otro para la incertidumbre, usando los años y sus respectivos valores
históricos.
4. Proyección: Para cada año posterior al último año de los datos base, se predicen los
valores de deforestación e incertidumbre, y se calculan los límites superior e inferior basados
en la incertidumbre y un intervalo de confianza del 95% (utilizando la fórmula "1.96 sigma").
5. Salida: Se guarda cada año simulado con su respectiva deforestación, incertidumbre y
límites de confianza en una lista de mapas, que luego se utiliza para el análisis o se guarda en
un archivo.
3. Método "iniciarSimulacion"

Este método permite iniciar la simulación a partir de datos introducidos manualmente o
previamente cargados en un archivo, y genera un archivo CSV con los resultados de la
simulación.
Explicación:
- Entradas:
- "anioInicio": El año de inicio de la simulación.
- "deforestaciones", "incs", "alfas", "limInfs", "limSups": Arreglos de cadenas que contienen
los datos de deforestación, incertidumbre, alfa (coeficiente de ajuste), y los límites inferior y
superior para cada año.
- "añoFin": El año final hasta el cual se simularán los datos.
- Proceso:
1. Validación de tamaños de arreglos: Se asegura de que todos los arreglos tengan el mismo
tamaño para evitar errores al escribir los datos.
2. Creación de archivo CSV: Si el archivo de resultados ya existe, se elimina. Luego se crea un
nuevo archivo CSV donde se escribirán los datos de la simulación.
3. Conversión de datos: Los valores de deforestación, incertidumbre, alfa, límite inferior y
límite superior se convierten de cadenas de texto a números decimales ("double").
4. Escritura de datos iniciales: Para los primeros años (desde "anioInicio" hasta el último año
de los datos), los valores de deforestación, incertidumbre y límites son escritos en el archivo
CSV.
5. Simulación para años restantes: Para cada año posterior, se simula la fluctuación de la
deforestación (con un rango del ±3%) y se calculan la incertidumbre y los límites basados en
valores aleatorios. Estos datos se escriben en el archivo CSV.

4. Método "calcularSimulacionConVariabilidad"

Este método genera fluctuaciones controladas para simular los cambios en los valores de
deforestación para años futuros, incorporando una variabilidad del 10% basada en la tasa de
cambio promedio entre los datos históricos.
Explicación:
- Entradas: "valores": Un arreglo de valores históricos para la deforestación.
- Proceso: Se calcula la tasa de cambio promedio entre los valores históricos y luego se aplica
una fluctuación aleatoria dentro de un rango del 10% de esta tasa.
- Salida: Devuelve el valor simulado ajustado con variabilidad para el año futuro.
5. Método "calcularExtrapolacionSuave"
Este método realiza una extrapolación suave de los datos históricos mediante la suavización
de las tasas de cambio entre años, aplicando un factor de suavizado de 0.5 para evitar
fluctuaciones abruptas.

Explicación:
- Entradas: "años": Un arreglo con los años históricos, "valores": Los valores de deforestación
correspondientes a esos años, "añoSimulacion": El año para el cual se desea realizar la
extrapolación.
- Proceso: Se calcula la tasa de cambio promedio entre los años históricos, se suaviza y se
utiliza para proyectar el valor de deforestación para el año de simulación, asegurando que esté
dentro de un límite razonable (80% a 120% del valor final).
- Salida: Devuelve el valor simulado extrapolado para el año deseado.
5. Método "calcularRegresionLineal"

Explicación:
- Entradas: "años": Un arreglo con los años históricos, "valores": Los valores de deforestación
correspondientes a esos años, "añoSimulacion": El año para el cual se desea realizar la
extrapolación.
- Proceso: Se calcula la tasa de cambio promedio entre los años históricos, se suaviza y se
utiliza para proyectar el valor de deforestación para el año de simulación, asegurando que esté
dentro de un límite razonable (80% a 120% del valor final).
- Salida: Devuelve el valor simulado extrapolado para el año deseado.
5. Método "calcularRegresionLineal"
Este método implementa la fórmula de la regresión lineal para predecir los valores futuros de
deforestación o cualquier otra variable basada en los años y sus valores históricos.
Explicación:
- Entradas: "años": Un arreglo con los años históricos, "valores": Los valores de deforestación
correspondientes, "añoSimulacion": El año para el cual se quiere calcular la proyección.
- Proceso: Se calcula la pendiente y la intersección de la recta de regresión usando las sumas
necesarias para la fórmula de regresión lineal, y luego se predice el valor para el año de
simulación.
- Salida: Devuelve el valor proyectado para el año deseado.
El conjunto de todos estos métodos trabajan para generar simulaciones realistas de la
deforestación, considerando tanto los datos históricos como la incertidumbre y la variabilidad
inherente a los modelos de predicción. Cada uno de estos métodos se utiliza de manera
iterativa o complementaria para generar los resultados simulados que luego son procesados y
presentados en la interfaz gráfica o exportados a un archivo para su análisis posterior.
Resultados esperados
Los resultados esperados del análisis estadístico incluyen la obtención de un modelo de
predicción confiable y una comprensión detallada de las tendencias presentes en los datos.
Además, se espera identificar cualquier patrón significativo y simular variaciones para evaluar
la solidez del modelo, brindando así una herramienta analítica que ayude a anticipar y manejar
cambios en el contexto del estudio.


Referencias bibliograficas

“Bosques.”
Inegi, https://www.inegi.org.mx/temas/bosques/. Accessed 30 October 2024.
“Deforestación – Sistema Nacional de Monitoreo Forestal.”
Sistema Nacional de Monitoreo Forestal,
https://snmf.cnf.gob.mx/deforestacion/. Accessed 30 October 2024.
“Se reduce en 26%la tasa anual de deforestación.”
Gobierno de México, 30 December 2022,
https://www.gob.mx/conafor/prensa/se-reduce-en-26-la-tasa-anual-de-deforestacion. Accessed 30
October 2024.
Rosete-Vergés, F. A., Pérez-Damián, J. L., Villalobos-Delgado, M., Navarro-Salas, E. N.,
Salinas-Chávez, E., & Remond-Noa, R. (2014). El avance de la deforestación en México 1976-
2007. Madera y Bosques, 20(1), 21-35. https://www.scielo.org.mx/scielo.php?
script=sci_arttext&pid=S1405-04712014000100003
